package com.wj.driving.restfulapi.service.impl.drivercomment;

import com.wj.driving.restfulapi.dto.drivercomment.DriverCommentDetailsDTO;
import com.wj.driving.restfulapi.request.DriverCommentRequest;
import com.wj.driving.restfulapi.result.PageResult;
import com.wj.driving.restfulapi.service.drivercomment.IDriverCommentService;

/**
 * <p>
 *  代驾评价管理
 * </p>
 *
 * @author wangjian
 * @since 2021/4/27
 */
public class DriverCommentServiceImpl implements IDriverCommentService {

    @Override
    public PageResult<DriverCommentDetailsDTO> selectPagee(DriverCommentRequest request) {
        return null;
    }
}