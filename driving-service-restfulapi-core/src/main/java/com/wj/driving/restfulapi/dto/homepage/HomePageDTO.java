package com.wj.driving.restfulapi.dto.homepage;

import java.io.Serializable;
import java.util.List;

public class HomePageDTO implements Serializable {

    private Long orderNum;

    private Long userNum;

    private Double totalMoney;

    private List<Integer> weekOrders;

    private List<DriverOrderDTO> driverOrders;

    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    public Long getUserNum() {
        return userNum;
    }

    public void setUserNum(Long userNum) {
        this.userNum = userNum;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public List<Integer> getWeekOrders() {
        return weekOrders;
    }

    public void setWeekOrders(List<Integer> weekOrders) {
        this.weekOrders = weekOrders;
    }

    public List<DriverOrderDTO> getDriverOrders() {
        return driverOrders;
    }

    public void setDriverOrders(List<DriverOrderDTO> driverOrders) {
        this.driverOrders = driverOrders;
    }
}
