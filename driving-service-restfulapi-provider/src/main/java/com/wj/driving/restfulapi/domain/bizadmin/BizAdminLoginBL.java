/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.domain.bizadmin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wj.driving.restfulapi.domain.bo.AdminBO;
import com.wj.driving.restfulapi.domain.mapper.AdminMapper;
import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;
import com.wj.driving.restfulapi.dto.admin.AdminLoginDTO;
import com.wj.driving.restfulapi.enums.admin.AuthEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName BizAdminLoginBL
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 10:48
 */
@Service
public class BizAdminLoginBL {

    @Autowired
    private AdminMapper userMapper;


    public AdminDetailsDTO adminlogin(AdminLoginDTO admin) {
        QueryWrapper<AdminBO> wrapper = new QueryWrapper<AdminBO>();
        wrapper.eq("phone",admin.getPhone())
                .eq("password",admin.getPassword());
        AdminBO adminBO = userMapper.selectOne(wrapper);
        if(adminBO!=null) {
            AdminDetailsDTO adminDTO = new AdminDetailsDTO();
            adminDTO.setId(adminBO.getId());
            adminDTO.setPhone(adminBO.getPhone());
            adminDTO.setSex(adminBO.getSex());
            adminDTO.setAge(adminBO.getAge());
            adminDTO.setPassword(adminBO.getPassword());
            adminDTO.setName(adminBO.getName());
            adminDTO.setAuth(adminBO.getAuth());
            adminDTO.setAuthName(AuthEnum.getSourceType(adminBO.getAuth()));
            return adminDTO;
        }
        return null;
    }

}