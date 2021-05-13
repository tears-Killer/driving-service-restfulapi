package com.wj.driving.restfulapi.dto.homepage;

import java.io.Serializable;

public class DriverOrderDTO implements Serializable {

    private Integer orderCount;

    private String driverName;

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
