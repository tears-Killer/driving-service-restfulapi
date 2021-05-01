package com.wj.driving.restfulapi.domain.bl.drivercomment;

import com.google.common.collect.Lists;
import com.wj.driving.restfulapi.domain.mapper.drivercomment.DriverCommentMapper;
import com.wj.driving.restfulapi.dto.drivercomment.DriverCommentDetailsDTO;
import com.wj.driving.restfulapi.request.DriverCommentRequest;
import com.wj.driving.restfulapi.result.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  代驾评价
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
        int totalCount = driverCommentMapper.countPage(request.getDriverId());
        List<DriverCommentDetailsDTO> commentDetailsDTOList = totalCount > 0 ? driverCommentMapper.getAllCommentsById(request.getDriverId()): Lists.newArrayList();
        pageResult.setTotalCount(totalCount);
        pageResult.setList(commentDetailsDTOList);
        return pageResult;
    }
}