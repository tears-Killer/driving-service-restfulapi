package com.wj.driving.restfulapi.domain.mapper.drivercomment;

import com.wj.driving.restfulapi.domain.bo.DriverCommentBO;
import com.wj.driving.restfulapi.dto.drivercomment.DriverCommentDetailsDTO;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author wangjian
 * @since 2021/4/27
 */
public interface DriverCommentMapper {
    int countPage(Long driverId);

    List<DriverCommentDetailsDTO> getAllCommentsById(Long driverId);
}