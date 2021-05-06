package com.wj.driving.restfulapi.service.userorder;

import com.wj.driving.restfulapi.dto.drivercomment.DriverCommentDetailsDTO;
import com.wj.driving.restfulapi.dto.userorder.OrderDetailsDTO;
import com.wj.driving.restfulapi.request.userorder.UserOrderRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;

/**
 * <p>
 *    订单服务
 * </p>
 *
 * @author wangjian
 * @since 2021/4/20
 */
public interface IUserOrderService {

    /**
     * 订单分页查询
     * @param request
     * @return
     */
    PageResult<OrderDetailsDTO> selectPage(UserOrderRequestSearch request);

    /**
     * 修改订单信息
     * @param orderDetailsDTO
     * @return
     */
    int updateOrderInfo(OrderDetailsDTO orderDetailsDTO);

    /**
     * 根据id获取订单评价
     * @param orderDetailsDTO
     * @return
     */
    DriverCommentDetailsDTO findCommentById(OrderDetailsDTO orderDetailsDTO);
}