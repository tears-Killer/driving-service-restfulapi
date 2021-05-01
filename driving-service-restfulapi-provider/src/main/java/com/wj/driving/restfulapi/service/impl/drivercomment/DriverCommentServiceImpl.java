package com.wj.driving.restfulapi.service.impl.drivercomment;

import com.alibaba.dubbo.config.annotation.Service;
import com.wj.driving.restfulapi.domain.bl.drivercomment.DriverCommentBL;
import com.wj.driving.restfulapi.dto.drivercomment.DriverCommentDetailsDTO;
import com.wj.driving.restfulapi.request.DriverCommentRequest;
import com.wj.driving.restfulapi.result.PageResult;
import com.wj.driving.restfulapi.service.drivercomment.IDriverCommentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  代驾评价管理
 * </p>
 *
 * @author wangjian
 * @since 2021/4/27
 */
@Service
public class DriverCommentServiceImpl implements IDriverCommentService {

    @Autowired
    private DriverCommentBL driverCommentBL;

    /**
     * 获取评价列表
     * @param request
     * @return
     */
    @Override
    public PageResult<DriverCommentDetailsDTO> selectPagee(DriverCommentRequest request) {
        return driverCommentBL.getAllComments(request);
    }
}