package com.wj.driving.restfulapi.domain.bl.userorder;

import com.wj.driving.restfulapi.domain.mapper.userorder.UserOrderMapper;
import com.wj.driving.restfulapi.dto.userorder.OrderDetailsDTO;
import com.wj.driving.restfulapi.enums.user.UserStatusEnum;
import com.wj.driving.restfulapi.request.userorder.UserOrderRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  订单业务
 * </p>
 *
 * @author wangjian
 * @since 2021/4/21
 */
@Service
public class UserOrderBL {

    @Resource
    private UserOrderMapper userOrderMapper;

    public PageResult<OrderDetailsDTO> selectPage(UserOrderRequestSearch request){
        PageResult<OrderDetailsDTO> pageResult = new PageResult<>();
        int totalCount = userOrderMapper.countPage(request);
        List<OrderDetailsDTO> orderList = userOrderMapper.getOrderList(request);
        orderList.forEach(orderDetailsDTO -> {
            orderDetailsDTO.setStateName(UserStatusEnum.getSourceType(orderDetailsDTO.getState()));
        });

        pageResult.setTotalCount(totalCount);
        pageResult.setList(orderList);
        return pageResult;
    }

    public int updateOrderInfo(OrderDetailsDTO orderDetailsDTO){
        return userOrderMapper.updateOrderInfo(orderDetailsDTO);
    }
}