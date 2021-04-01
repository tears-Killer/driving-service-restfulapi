/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.service.useraddress;

import com.wj.driving.restfulapi.dto.useraddress.UserAddressDTO;
import com.wj.driving.restfulapi.request.useraddress.UserAddressRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;

import java.util.List;

/**
 * @InterfaceName IUserAddressService
 * @Description 目的地管理
 * @Author wangjian
 * @Date 2021/4/1 10:56
 */
public interface IUserAddressService {

    /**
     * 查询客户默认目的地列表分页
     * @return
     */
    PageResult<UserAddressDTO> selectPage(UserAddressRequestSearch request);
}