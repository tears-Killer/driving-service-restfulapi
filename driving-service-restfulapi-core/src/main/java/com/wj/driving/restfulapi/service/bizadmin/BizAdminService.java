package com.wj.driving.restfulapi.service.bizadmin;

import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;
import com.wj.driving.restfulapi.request.AdminSearchRequest;

import java.util.List;

/**
 * @ClassName BizAdminService
 * @Description
 * @Author wangjian
 * @Date 2020/12/31 16:33
 */
public interface BizAdminService {

    List<AdminDetailsDTO> getAllAdmin(AdminSearchRequest request);

    int addAdmin(AdminDetailsDTO adminDTO);

    int updateAdmin(AdminDetailsDTO adminDTO);

    int updateAdminPWD(AdminDetailsDTO adminDTO,String newPassword);

    int deleteAdmin(Long id);
}