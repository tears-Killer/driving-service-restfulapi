package com.wj.driving.restfulapi.domain.mapper.admin;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wj.driving.restfulapi.domain.bo.AdminBO;
import com.wj.driving.restfulapi.request.admin.AdminSearchRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName AdminMapper
 * @Description
 * @Author wangjian
 * @Date 2020/12/22 16:00
 */
@Repository
public interface AdminMapper extends BaseMapper<AdminBO> {

    List<AdminBO> selectPage(AdminSearchRequest request);

    int countAdmin(AdminSearchRequest request);
}