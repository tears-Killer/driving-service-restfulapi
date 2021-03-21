/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.domain.bl.bizadmin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wj.driving.restfulapi.domain.bo.AdminBO;
import com.wj.driving.restfulapi.domain.mapper.admin.AdminMapper;
import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;
import com.wj.driving.restfulapi.enums.admin.AuthEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName BizAdminBL
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 12:50
 */
@Service
public class BizAdminBL {

    @Autowired
    private AdminMapper userMapper;


    public List<AdminDetailsDTO> getAllAdmin() {

        List<AdminBO> adminBOList = userMapper.selectList(null);
        List<AdminDetailsDTO> adminDTOList = new ArrayList<>();
        return adminBOList.stream().map(item -> {
            AdminDetailsDTO adminDTO = new AdminDetailsDTO();
            adminDTO.setId(item.getId());
            adminDTO.setPhone(item.getPhone());
            adminDTO.setSex(item.getSex());
            adminDTO.setAge(item.getAge());
            adminDTO.setPassword(item.getPassword());
            adminDTO.setName(item.getName());
            adminDTO.setAuth(item.getAuth());
            return adminDTO;
        }).collect(Collectors.toList());
    }


    public int addAdmin(AdminDetailsDTO adminDTO){
        AdminBO adminBO = new AdminBO();
        adminBO.setName(adminDTO.getName());
        adminBO.setSex(adminDTO.getSex());
        adminBO.setAge(adminDTO.getAge());
        adminBO.setPhone(adminDTO.getPhone());
        adminBO.setPassword(adminDTO.getPassword());
        adminBO.setAuth(adminDTO.getAuth());
        return userMapper.insert(adminBO);
    }


    public int updateAdmin(AdminDetailsDTO adminDTO){
        AdminBO adminBO = new AdminBO();
        adminBO.setId(adminDTO.getId());
        adminBO.setName(adminDTO.getName());
        adminBO.setSex(adminDTO.getSex());
        adminBO.setAge(adminDTO.getAge());
        adminBO.setPhone(adminDTO.getPhone());
        adminBO.setPassword(adminDTO.getPassword());
        adminBO.setAuth(adminDTO.getAuth());
        adminDTO.setAuthName(AuthEnum.getSourceType(adminBO.getAuth()));
        return userMapper.updateById(adminBO);
    }

    public int updateAdminPWD(AdminDetailsDTO adminDTO,String newPWD){
        QueryWrapper<AdminBO> wrapper = new QueryWrapper<>();
        wrapper.eq("id",adminDTO.getId())
                .eq("password",adminDTO.getPassword());
        AdminBO adminBO = userMapper.selectOne(wrapper);
        if(adminBO!=null){
            adminBO.setPassword(newPWD);
            return userMapper.updateById(adminBO);
        }
        return 0;
    }

    public int deleteAdmin(Long id){
        return userMapper.deleteById(id);
    }
}