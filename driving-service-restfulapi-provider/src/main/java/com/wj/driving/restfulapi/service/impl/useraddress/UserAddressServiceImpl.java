/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.service.impl.useraddress;

import com.wj.driving.restfulapi.dto.useraddress.UserAddressDTO;
import com.wj.driving.restfulapi.request.useraddress.UserAddressRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import com.wj.driving.restfulapi.service.useraddress.IUserAddressService;

/**
 * @ClassName UserAddressServiceImpl
 * @Description 目的地管理
 * @Author wangjian
 * @Date 2021/4/1 11:22
 */
public class UserAddressServiceImpl implements IUserAddressService {

    /**
     *查询客户默认目的地列表分页
     * @param request
     * @return
     */
    @Override
    public PageResult<UserAddressDTO> selectPage(UserAddressRequestSearch request) {
        return null;
    }
}