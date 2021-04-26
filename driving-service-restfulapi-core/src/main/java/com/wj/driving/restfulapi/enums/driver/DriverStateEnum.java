package com.wj.driving.restfulapi.enums.driver;

import com.wj.driving.restfulapi.enums.useraddress.UserAddressStateEnum;

/**
 * <p>
 *  代驾状态
 * </p>
 *
 * @author wangjian
 * @since 2021/4/23
 */
public enum DriverStateEnum {
    启用(0,"启用"),
    禁用(1,"禁用");


    private Integer value;

    private String driverState;

    DriverStateEnum(Integer value, String driverState) {
        this.value = value;
        this.driverState = driverState;
    }

    public static String getSourceType(Integer state) {
        for (DriverStateEnum ele : values()) {
            if(ele.value.equals(state)){
                return ele.driverState;
            }
        }
        return null;
    }
}