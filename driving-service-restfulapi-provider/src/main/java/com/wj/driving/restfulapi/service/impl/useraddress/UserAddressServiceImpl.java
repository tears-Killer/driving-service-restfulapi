/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.service.impl.useraddress;

import com.alibaba.dubbo.config.annotation.Service;
import com.wj.driving.restfulapi.domain.bl.useraddress.UserAddressBL;
import com.wj.driving.restfulapi.dto.useraddress.UserAddressDTO;
import com.wj.driving.restfulapi.request.useraddress.UserAddressRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import com.wj.driving.restfulapi.service.useraddress.IUserAddressService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName UserAddressServiceImpl
 * @Description 目的地管理
 * @Author wangjian
 * @Date 2021/4/1 11:22
 */
@Service
public class UserAddressServiceImpl implements IUserAddressService {

    @Autowired
    private UserAddressBL userAddressBL;

    /**
     *查询客户默认目的地列表分页
     * @param request
     * @return
     */
    @Override
    public PageResult<UserAddressDTO> selectPage(UserAddressRequestSearch request) {
        return userAddressBL.getUserAddressList(request);
    }

    @Override
    public List<UserAddressDTO> getcommonlyAddressList(UserAddressDTO userAddressDTO) {
        return userAddressBL.getCommonlyAddressList(userAddressDTO);
    }
}