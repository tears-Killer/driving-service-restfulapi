/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.service.impl.bizadmin;

import com.alibaba.dubbo.config.annotation.Service;
import com.wj.driving.restfulapi.domain.bizadmin.BizAdminLoginBL;
import com.wj.driving.restfulapi.domain.bo.AdminBO;
import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;
import com.wj.driving.restfulapi.dto.admin.AdminLoginDTO;
import com.wj.driving.restfulapi.service.bizadmin.BizAdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName BizAdminLoginServiceImpl
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 17:04
 */
@Service
public class BizAdminLoginServiceImpl implements BizAdminLoginService {

    @Autowired
    private BizAdminLoginBL bizAdminLoginBL;


    @Override
    public AdminDetailsDTO checkLogin(AdminLoginDTO admin) {
        return bizAdminLoginBL.adminlogin(admin);
    }
}