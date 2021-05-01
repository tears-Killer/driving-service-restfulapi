package com.wj.driving.restfulapi.domain.bl.driver;

import com.wj.driving.restfulapi.domain.bo.DriverBO;
import com.wj.driving.restfulapi.domain.mapper.driver.DriverMapper;
import com.wj.driving.restfulapi.dto.driver.DriverDetailsDTO;
import com.wj.driving.restfulapi.enums.driver.DriverStateEnum;
import com.wj.driving.restfulapi.request.driver.DriverRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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

    @Resource
    private DriverMapper driverMapper;

    public PageResult<DriverDetailsDTO> selectPage(DriverRequestSearch requestSearch){
        PageResult<DriverDetailsDTO> result = new PageResult<>();
        int totalCount = driverMapper.countPage(requestSearch);
        List<DriverDetailsDTO> resultList = new ArrayList<>();
        if(totalCount>0){
            List<DriverBO> driverDetailsList = driverMapper.getDriverDetailsList(requestSearch);
            driverDetailsList.forEach(driverBO -> {
                DriverDetailsDTO driverDetailsDTO = new DriverDetailsDTO();
                BeanUtils.copyProperties(driverBO,driverDetailsDTO);
                driverDetailsDTO.setStateName(DriverStateEnum.getSourceType(driverBO.getState()));
                resultList.add(driverDetailsDTO);
            });
        }
        result.setList(resultList);
        result.setTotalCount(totalCount);
        return result;
    }
}