/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.service.bizadmin;

import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;

import java.util.List;

/**
 * @ClassName BizAdminService
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 16:33
 */
public interface BizAdminService {

    List<AdminDetailsDTO> getAllAdmin();

    int addAdmin(AdminDetailsDTO adminDTO);

    int updateAdmin(AdminDetailsDTO adminDTO);

    int updateAdminPWD(AdminDetailsDTO adminDTO);
}