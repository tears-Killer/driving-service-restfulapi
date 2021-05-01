package com.wj.driving.restfulapi.service.drivercomment;

import com.wj.driving.restfulapi.dto.drivercomment.DriverCommentDetailsDTO;
import com.wj.driving.restfulapi.request.DriverCommentRequest;
import com.wj.driving.restfulapi.result.PageResult;

/**
 * <p>
 *  代驾评价
 * </p>
 *
 * @author wangjian
 * @since 2021/4/27
 */
public interface IDriverCommentService {

    PageResult<DriverCommentDetailsDTO> selectPagee(DriverCommentRequest request);
}