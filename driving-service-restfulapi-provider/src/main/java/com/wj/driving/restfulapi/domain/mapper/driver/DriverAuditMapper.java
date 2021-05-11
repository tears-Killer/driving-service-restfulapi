package com.wj.driving.restfulapi.domain.mapper.driver;

import com.wj.driving.restfulapi.domain.bo.DriverAuditBO;
import com.wj.driving.restfulapi.dto.driver.DriverAuditDTO;
import com.wj.driving.restfulapi.request.driver.DriverRequestSearch;

import java.util.List;

public interface DriverAuditMapper {

    int countPage(DriverRequestSearch request);

    List<DriverAuditBO> getWaitAuditList(DriverRequestSearch request);

    DriverAuditBO getAuditDriverById(DriverAuditDTO auditDTO);

    int deleteAuditDriver(DriverAuditDTO auditDTO);

    int updateAuditState(DriverAuditDTO auditDTO);
}
