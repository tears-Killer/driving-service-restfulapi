package com.wj.driving.restfulapi.enums.userorder;

/**
 * <p>
 *  订单状态
 * </p>
 *
 * @author wangjian
 * @since 2021/4/20
 */
public enum OrderStateEnum {
    待接单(0,"待接单"),
    已接单(1,"已接单"),
    已完成(2,"已完成"),
    已取消(3,"已取消"),
    待支付(4,"待支付");

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