package com.wj.driving.restfulapi.domain.bl.driver;

import com.google.common.collect.Lists;
import com.wj.driving.restfulapi.domain.bo.DriverAuditBO;
import com.wj.driving.restfulapi.domain.bo.DriverBO;
import com.wj.driving.restfulapi.domain.mapper.driver.DriverAuditMapper;
import com.wj.driving.restfulapi.domain.mapper.driver.DriverMapper;
import com.wj.driving.restfulapi.dto.driver.DriverAuditDTO;
import com.wj.driving.restfulapi.dto.driver.DriverDetailsDTO;
import com.wj.driving.restfulapi.enums.driver.DriverAuditStateEnum;
import com.wj.driving.restfulapi.enums.driver.DriverStateEnum;
import com.wj.driving.restfulapi.request.driver.DriverRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Resource
    private DriverAuditMapper driverAuditMapper;

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

    public int updateDriverState(DriverDetailsDTO dto){
        return driverMapper.updateDriverState(dto);
    }

    public PageResult<DriverAuditDTO> waitAuditList(DriverRequestSearch request){
        PageResult<DriverAuditDTO> result = new PageResult<>();
        int totalCount = driverAuditMapper.countPage(request);
        List<DriverAuditBO> waitAuditList = totalCount>0 ? driverAuditMapper.getWaitAuditList(request) : Lists.newArrayList();
        List<DriverAuditDTO> resultList = new ArrayList<>();
        if(totalCount>0){
            waitAuditList.forEach(item ->{
                DriverAuditDTO auditDTO = new DriverAuditDTO();
                BeanUtils.copyProperties(item,auditDTO);
                auditDTO.setStateName(DriverAuditStateEnum.getSourceType(item.getState()));
                resultList.add(auditDTO);
            });
        }
        result.setList(resultList);
        result.setTotalCount(totalCount);
        return result;
    }

    @Transactional(rollbackFor = Exception.class)
    public int auditApproved(DriverAuditDTO auditDTO){
        DriverAuditBO auditBO = driverAuditMapper.getAuditDriverById(auditDTO);
        if(Objects.nonNull(auditBO)){
            DriverBO driverBO = new DriverBO();
            BeanUtils.copyProperties(auditBO,driverBO);
            int result = driverMapper.insertDriver(driverBO);
            if(result>0){
              return driverAuditMapper.deleteAuditDriver(auditDTO);
            }
        }
        return 0;
    }

    @Transactional(rollbackFor = Exception.class)
    public int auditRefused(DriverAuditDTO auditDTO){
       return driverAuditMapper.updateAuditState(auditDTO);
    }
}