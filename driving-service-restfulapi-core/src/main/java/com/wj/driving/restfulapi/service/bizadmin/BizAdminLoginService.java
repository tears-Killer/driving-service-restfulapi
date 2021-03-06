/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.service.bizadmin;

import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;
import com.wj.driving.restfulapi.dto.admin.AdminLoginDTO;

/**
 * @InterfaceName BizAdminLoginService
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 16:09
 */
public interface BizAdminLoginService {

    AdminDetailsDTO checkLogin(AdminLoginDTO adminLoginDTO);
}