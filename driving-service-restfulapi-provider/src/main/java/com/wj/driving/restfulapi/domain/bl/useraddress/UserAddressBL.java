/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.domain.bl.useraddress;

import com.wj.driving.restfulapi.domain.mapper.useraddress.UserAddressMapper;
import com.wj.driving.restfulapi.dto.useraddress.UserAddressDTO;
import com.wj.driving.restfulapi.request.useraddress.UserAddressRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
        List<UserAddressDTO> defaultAddressList = userAddressMapper.getDefaultAddressList(request);
        result.setTotalCount(totalCount);
        result.setList(defaultAddressList);
        return result;
    }

    public List<UserAddressDTO> getCommonlyAddressList(UserAddressDTO userAddressDTO){
        return userAddressMapper.getCommonlyAddressListByUserId(userAddressDTO.getUserId());
    }
}