package com.wj.driving.restfulapi.service.bizadmin;

import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;
import com.wj.driving.restfulapi.dto.admin.AdminLoginDTO;

/**
 * @InterfaceName BizAdminLoginService
 * @Description
 * @Author wangjian
 * @Date 2020/12/31 16:09
 */
public interface BizAdminLoginService {

    /**
     * 登陆
     * @param adminLoginDTO
     * @return
     */
    AdminDetailsDTO checkLogin(AdminLoginDTO adminLoginDTO);
}