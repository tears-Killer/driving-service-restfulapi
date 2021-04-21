package com.wj.driving.restfulapi.service.userorder;

import com.wj.driving.restfulapi.dto.userorder.OrderDetailsDTO;
import com.wj.driving.restfulapi.result.PageResult;

/**
 * <p>
 *    订单服务
 * </p>
 *
 * @author wangjian
 * @since 2021/4/20
 */
public interface UserOrderService {

    PageResult<OrderDetailsDTO> selectPage();
}