package com.wj.driving.restfulapi.domain.mapper.userorder;

import com.wj.driving.restfulapi.dto.userorder.OrderDetailsDTO;
import com.wj.driving.restfulapi.request.userorder.UserOrderRequestSearch;

import java.util.List;

/**
 * <p>
 *  订单业务
 * </p>
 *
 * @author wangjian
 * @since 2021/4/21
 */
public interface UserOrderMapper {

    List<OrderDetailsDTO> getOrderList(UserOrderRequestSearch request);

    int countPage(UserOrderRequestSearch request);

    int updateOrderInfo(OrderDetailsDTO orderDetailsDTO);
}