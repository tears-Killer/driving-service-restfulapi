package com.wj.driving.restfulapi.service.impl.userorder;

import com.alibaba.dubbo.config.annotation.Service;
import com.wj.driving.restfulapi.domain.bl.userorder.UserOrderBL;
import com.wj.driving.restfulapi.dto.userorder.OrderDetailsDTO;
import com.wj.driving.restfulapi.request.userorder.UserOrderRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import com.wj.driving.restfulapi.service.userorder.IUserOrderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  订单业务
 * </p>
 *
 * @author wangjian
 * @since 2021/4/21
 */
@Service
public class UserOrderServiceImpl implements IUserOrderService {

    @Autowired
    private UserOrderBL userOrderBL;

    @Override
    public PageResult<OrderDetailsDTO> selectPage(UserOrderRequestSearch request) {
        return userOrderBL.selectPage(request);
    }

    @Override
    public int updateOrderInfo(OrderDetailsDTO orderDetailsDTO) {
        return userOrderBL.updateOrderInfo(orderDetailsDTO);
    }
}