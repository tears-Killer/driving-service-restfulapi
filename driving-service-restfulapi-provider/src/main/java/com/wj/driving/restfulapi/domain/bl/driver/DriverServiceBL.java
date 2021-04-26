package com.wj.driving.restfulapi.domain.bl.driver;

import com.wj.driving.restfulapi.dto.driver.DriverDetailsDTO;
import com.wj.driving.restfulapi.request.driver.DriverRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  代驾管理
 * </p>
 *
 * @author wangjian
 * @since 2021/4/23
 */
@Service
public class DriverServiceBL {

    public PageResult<DriverDetailsDTO> selectPage(DriverRequestSearch requestSearch){
        return null;
    }
}