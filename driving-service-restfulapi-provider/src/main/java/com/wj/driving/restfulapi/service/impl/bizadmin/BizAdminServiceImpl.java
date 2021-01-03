/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.service.impl.bizadmin;

import com.alibaba.dubbo.config.annotation.Service;
import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName BizAdminService
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 17:47
 */
@Service
public class BizAdminServiceImpl implements com.wj.driving.restfulapi.service.bizadmin.BizAdminService {

    @Autowired
    private com.wj.driving.restfulapi.service.bizadmin.BizAdminService bizAdminService;

    @Override
    public List<AdminDetailsDTO> getAllAdmin() {
        return bizAdminService.getAllAdmin();
    }
}