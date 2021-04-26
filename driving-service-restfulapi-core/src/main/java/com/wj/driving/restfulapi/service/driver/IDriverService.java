package com.wj.driving.restfulapi.service.driver;

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
     * 代价人员列表
     * @return
     */
    PageResult<DriverDetailsDTO> selectPage(DriverRequestSearch request);
}