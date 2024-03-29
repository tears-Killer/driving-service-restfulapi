package com.wj.driving.restfulapi.service.driver;

import com.wj.driving.restfulapi.dto.driver.DriverAuditDTO;
import com.wj.driving.restfulapi.dto.driver.DriverDetailsDTO;
import com.wj.driving.restfulapi.request.driver.DriverRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;

/**
 * <p>
 *  代驾业务
 * </p>
 *
 * @author wangjian
 * @since 2021/4/23
 */
public interface IDriverService {

    /**
     * 获取代驾人员列表
     * @param request
     * @return
     */
    PageResult<DriverDetailsDTO> selectPage(DriverRequestSearch request);

    /**
     * 修改代驾状态
     * @param driverDetailsDTO
     * @return
     */
    int updateDriverState(DriverDetailsDTO driverDetailsDTO);

    /**
     * 待审核列表
     * @param request
     * @return
     */
    PageResult<DriverAuditDTO> waitAuditList(DriverRequestSearch request);

    /**
     * 审核通过
     * @param auditDTO
     * @return
     */
    int auditApproved(DriverAuditDTO auditDTO);

    /**
     * 审核拒绝
     * @param auditDTO
     * @return
     */
    int auditRefuse(DriverAuditDTO auditDTO);
}