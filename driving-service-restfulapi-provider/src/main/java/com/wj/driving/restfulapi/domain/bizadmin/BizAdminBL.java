/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.domain.bizadmin;

import com.wj.driving.restfulapi.domain.bo.AdminBO;
import com.wj.driving.restfulapi.domain.mapper.AdminMapper;
import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;
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
            adminDTO.setAccount(item.getAccount());
            adminDTO.setPassword(item.getPassword());
            adminDTO.setName(item.getName());
            adminDTO.setAuth(item.getAuth());
            return adminDTO;
        }).collect(Collectors.toList());
    }
}