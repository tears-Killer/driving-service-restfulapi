package com.wj.driving.restfulapi.enums.userorder;

import com.wj.driving.restfulapi.enums.user.UserStatusEnum;

/**
 * <p>
 *  订单状态
 * </p>
 *
 * @author wangjian
 * @since 2021/4/20
 */
public enum OrderStateEnum {
    未接单(0,"未接单"),
    已接单(1,"已接单"),
    运送中(2,"运送中"),
    已完成(3,"已完成"),
    已取消(4,"已取消");

    private Integer value;

    private String orderState;

    OrderStateEnum(Integer value, String orderState) {
        this.value = value;
        this.orderState = orderState;
    }

    public static String getSourceType(Integer value) {
        for (OrderStateEnum ele : values()) {
            if(ele.value.equals(value)){
                return ele.orderState;
            }
        }
        return null;
    }
}