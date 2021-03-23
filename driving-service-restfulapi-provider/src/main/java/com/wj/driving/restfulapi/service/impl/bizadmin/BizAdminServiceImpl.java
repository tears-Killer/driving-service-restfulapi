/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.service.impl.bizadmin;

import com.alibaba.dubbo.config.annotation.Service;
import com.wj.driving.restfulapi.domain.bl.bizadmin.BizAdminBL;
import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;
import com.wj.driving.restfulapi.request.AdminSearchRequest;
import com.wj.driving.restfulapi.service.bizadmin.BizAdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName BizAdminService
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 17:47
 */
@Service
public class BizAdminServiceImpl implements BizAdminService {

    @Autowired
    private BizAdminBL bizAdminBL;

    @Override
    public List<AdminDetailsDTO> getAllAdmin(AdminSearchRequest request) {
        return bizAdminBL.getAllAdmin(request);
    }

    @Override
    public int addAdmin(AdminDetailsDTO adminDTO) {
        return bizAdminBL.addAdmin(adminDTO);
    }

    @Override
    public int updateAdmin(AdminDetailsDTO adminDTO) {
        return bizAdminBL.updateAdmin(adminDTO);
    }

    @Override
    public int updateAdminPWD(AdminDetailsDTO adminDTO,String newPassword) {
        return bizAdminBL.updateAdminPWD(adminDTO,newPassword);
    }

    @Override
    public int deleteAdmin(Long id) {
        return bizAdminBL.deleteAdmin(id);
    }
}