package com.wj.driving.restfulapi.domain.mapper.driver;

import com.wj.driving.restfulapi.domain.bo.DriverBO;
import com.wj.driving.restfulapi.dto.driver.DriverDetailsDTO;
import com.wj.driving.restfulapi.request.driver.DriverRequestSearch;

import java.util.List;

/**
 * <p>
 *  代驾管理
 * </p>
 *
 * @author wangjian
 * @since 2021/4/23
 */
public interface DriverMapper {

    int countPage(DriverRequestSearch requestSearch);

    List<DriverBO> getDriverDetailsList(DriverRequestSearch requestSearch);

    int updateDriverState(DriverDetailsDTO driverDetailsDTO);

    int insertDriver(DriverBO driverBO);
}