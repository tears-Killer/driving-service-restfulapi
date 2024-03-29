/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.domain.bl.bizadmin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wj.driving.restfulapi.domain.bo.AdminBO;
import com.wj.driving.restfulapi.domain.mapper.admin.AdminMapper;
import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;
import com.wj.driving.restfulapi.enums.admin.AuthEnum;
import com.wj.driving.restfulapi.request.admin.AdminRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import com.wj.driving.restfulapi.utils.PrivacyDimmer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName BizAdminBL
 * @Description
 * @Author wangjian
 * @Date 2020/12/31 12:50
 */
@Service
public class BizAdminBL {

    @Autowired
    private AdminMapper adminMapper;


    public PageResult<AdminDetailsDTO> getAllAdmin(AdminRequestSearch request) {
        PageResult<AdminDetailsDTO> result = new PageResult();
        int totalCount = adminMapper.countAdmin(request);
        List<AdminBO> adminBOList = adminMapper.selectPage(request);
        if(totalCount>0){
            List<AdminDetailsDTO> dtoList = adminBOList.stream().map(item -> {
                AdminDetailsDTO adminDTO = new AdminDetailsDTO();
                adminDTO.setId(item.getId());
                adminDTO.setPhone(item.getPhone());
                adminDTO.setSex(item.getSex());
                adminDTO.setAge(item.getAge());
                adminDTO.setPassword(item.getPassword());
                if(StringUtils.isNotBlank(item.getIdCard())){
                    String idCard = PrivacyDimmer.maskIdCard(item.getIdCard());
                    adminDTO.setIdCard(idCard);
                }
                adminDTO.setName(item.getName());
                adminDTO.setAuth(item.getAuth());
                return adminDTO;
            }).collect(Collectors.toList());
            result.setList(dtoList);
            result.setTotalCount(totalCount);
        }
        return result;
    }


    public int addAdmin(AdminDetailsDTO adminDTO){
        AdminBO adminBO = new AdminBO();
        adminBO.setName(adminDTO.getName());
        adminBO.setSex(adminDTO.getSex());
        adminBO.setAge(adminDTO.getAge());
        adminBO.setPhone(adminDTO.getPhone());
        adminBO.setIdCard(adminDTO.getIdCard());
        adminBO.setPassword(adminDTO.getPassword());
        adminBO.setAuth(adminDTO.getAuth());
        return adminMapper.insert(adminBO);
    }


    public int updateAdmin(AdminDetailsDTO adminDTO){
        AdminBO adminBO = new AdminBO();
        adminBO.setId(adminDTO.getId());
        adminBO.setName(adminDTO.getName());
        adminBO.setSex(adminDTO.getSex());
        adminBO.setAge(adminDTO.getAge());
        adminBO.setPhone(adminDTO.getPhone());
        adminBO.setIdCard(adminBO.getIdCard());
        adminBO.setPassword(adminDTO.getPassword());
        adminBO.setAuth(adminDTO.getAuth());
        adminDTO.setAuthName(AuthEnum.getSourceType(adminBO.getAuth()));
        return adminMapper.updateById(adminBO);
    }

    public int updateAdminPWD(AdminDetailsDTO adminDTO,String newPWD){
        QueryWrapper<AdminBO> wrapper = new QueryWrapper<>();
        wrapper.eq("id",adminDTO.getId())
                .eq("password",adminDTO.getPassword());
        AdminBO adminBO = adminMapper.selectOne(wrapper);
        if(adminBO!=null){
            adminBO.setPassword(newPWD);
            return adminMapper.updateById(adminBO);
        }
        return 0;
    }

    public int deleteAdmin(Long id){
        return adminMapper.deleteById(id);
    }

    public int resetAdminPwd(AdminDetailsDTO adminDTO){
        QueryWrapper<AdminBO> wrapper = new QueryWrapper<>();
        wrapper.eq("id",adminDTO.getId());
        AdminBO adminBO = adminMapper.selectOne(wrapper);
        if(adminBO!=null){
            adminBO.setPassword("Dj123456");
            return adminMapper.updateById(adminBO);
        }
        return 0;
    }
}