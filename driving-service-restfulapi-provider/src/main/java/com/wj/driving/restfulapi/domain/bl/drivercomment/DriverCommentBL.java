package com.wj.driving.restfulapi.domain.bl.drivercomment;

import com.wj.driving.restfulapi.domain.mapper.drivercomment.DriverCommentMapper;
import com.wj.driving.restfulapi.dto.drivercomment.DriverCommentDetailsDTO;
import com.wj.driving.restfulapi.request.DriverCommentRequest;
import com.wj.driving.restfulapi.result.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *
 * </p>
 *
 * @author wangjian
 * @since 2021/4/27
 */
@Service
public class DriverCommentBL {

    @Resource
    private DriverCommentMapper driverCommentMapper;

    public PageResult<DriverCommentDetailsDTO> getAllComments(DriverCommentRequest request){
        PageResult<DriverCommentDetailsDTO> pageResult = new PageResult<>();
        return pageResult;
    }
}