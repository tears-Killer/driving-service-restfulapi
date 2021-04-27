package com.wj.driving.restfulapi.domain.mapper.drivercomment;

import com.wj.driving.restfulapi.domain.bo.DriverCommentBO;

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
    int countPage();
    List<DriverCommentBO> getAllCommentsById(Long driverId);
}