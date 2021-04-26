/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.domain.bl.useraddress;

import com.wj.driving.restfulapi.domain.mapper.useraddress.UserAddressMapper;
import com.wj.driving.restfulapi.dto.useraddress.UserAddressDTO;
import com.wj.driving.restfulapi.enums.useraddress.UserAddressStateEnum;
import com.wj.driving.restfulapi.request.useraddress.UserAddressRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName UserAddressBL
 * @Description 客户目的地管理
 * @Author wangjian
 * @Date 2021/4/2 13:41
 */
@Service
public class UserAddressBL {

    @Resource
    private UserAddressMapper userAddressMapper;

    public PageResult<UserAddressDTO> getUserAddressList(UserAddressRequestSearch request){
        request.setState("0");
        PageResult<UserAddressDTO> result = new PageResult<>();
        Integer totalCount = userAddressMapper.countPage(request);
        if(totalCount>0){
            List<UserAddressDTO> defaultAddressList = userAddressMapper.getDefaultAddressList(request);
            defaultAddressList.forEach(userAddressDTO -> {
                userAddressDTO.setStateName(UserAddressStateEnum.getSourceType(userAddressDTO.getState()));
            });
            result.setTotalCount(totalCount);
            result.setList(defaultAddressList);
        }
        return result;
    }

    public List<UserAddressDTO> getCommonlyAddressList(UserAddressDTO userAddressDTO){
        return userAddressMapper.getCommonlyAddressListByUserId(userAddressDTO.getUserId());
    }

    public void setDefaultAddress(UserAddressDTO userAddressDTO){
        Long defaultAddressId = userAddressMapper.getDefaultAddressId(userAddressDTO.getUserId());
        //将常用设为默认
        userAddressDTO.setState(0);
        userAddressMapper.updateAddressState(userAddressDTO);
        //将默认设为常用
        if(Objects.nonNull(defaultAddressId)){
            userAddressDTO.setState(1);
            userAddressDTO.setId(defaultAddressId);
            userAddressMapper.updateAddressState(userAddressDTO);
        }
    }

    public void deleteAddress(UserAddressDTO userAddressDTO){
        //获取删除地址的详细信息
        UserAddressDTO addressDetail = userAddressMapper.getAddressDetailById(userAddressDTO.getId());
        //删除地址
        userAddressMapper.deleteAddress(userAddressDTO.getId());
        //如果删除的是默认地址则将第一个常用地址设为默认地址
        if(Objects.nonNull(addressDetail) && Objects.nonNull(addressDetail.getState())){
            if(addressDetail.getState()==0){
                Long commonAddressTopUseId = userAddressMapper.getCommonAddressTopUse(userAddressDTO.getUserId());
                userAddressDTO.setId(commonAddressTopUseId);
                userAddressDTO.setState(0);
                setDefaultAddress(userAddressDTO);
            }
        }
    }
}