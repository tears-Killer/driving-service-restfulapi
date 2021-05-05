package com.wj.driving.restfulapi.domain.bl.drivercomment;

import com.google.common.collect.Lists;
import com.wj.driving.restfulapi.domain.mapper.drivercomment.DriverCommentMapper;
import com.wj.driving.restfulapi.dto.drivercomment.DriverCommentDetailsDTO;
import com.wj.driving.restfulapi.request.driver.DriverCommentRequest;
import com.wj.driving.restfulapi.result.PageResult;
import com.wj.driving.restfulapi.utils.PrivacyDimmer;
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
        if(totalCount>0){
            commentDetailsDTOList.forEach(driverCommentDetailsDTO -> {
                driverCommentDetailsDTO.setMobileNo(PrivacyDimmer.maskMobile(driverCommentDetailsDTO.getMobileNo()));
            });
        }
        pageResult.setTotalCount(totalCount);
        pageResult.setList(commentDetailsDTOList);
        return pageResult;
    }
}