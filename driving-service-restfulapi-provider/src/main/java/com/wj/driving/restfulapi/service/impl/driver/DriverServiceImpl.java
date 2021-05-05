package com.wj.driving.restfulapi.service.impl.driver;

import com.alibaba.dubbo.config.annotation.Service;
import com.wj.driving.restfulapi.domain.bl.driver.DriverServiceBL;
import com.wj.driving.restfulapi.dto.driver.DriverDetailsDTO;
import com.wj.driving.restfulapi.request.driver.DriverRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import com.wj.driving.restfulapi.service.driver.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  代驾管理
 * </p>
 *
 * @author wangjian
 * @since 2021/4/23
 */
@Service
public class DriverServiceImpl implements IDriverService {

    @Autowired
    private DriverServiceBL driverServiceBL;

    /**
     * 获取代驾人员列表
     * @param request
     * @return
     */
    @Override
    public PageResult<DriverDetailsDTO> selectPage(DriverRequestSearch request) {
        PageResult<DriverDetailsDTO> result = driverServiceBL.selectPage(request);
        return result;
    }

    @Override
    public int updateDriverState(DriverDetailsDTO driverDetailsDTO) {
        return 0;
    }
}