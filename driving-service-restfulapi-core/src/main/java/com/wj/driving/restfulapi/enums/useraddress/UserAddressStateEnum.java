package com.wj.driving.restfulapi.enums.useraddress;

/**
 * <p>
 *   客户目的地状态
 * </p>
 *
 * @author wangjian
 * @since 2021/4/21
 */
public enum UserAddressStateEnum {
    默认(0,"默认"),
    常用(1,"常用");

    private Integer value;

    private String addressState;

    UserAddressStateEnum(Integer value, String addressState) {
        this.value = value;
        this.addressState = addressState;
    }

    public static String getSourceType(Integer state) {
        for (UserAddressStateEnum ele : values()) {
            if(ele.value.equals(state)){
                return ele.addressState;
            }
        }
        return null;
    }
}