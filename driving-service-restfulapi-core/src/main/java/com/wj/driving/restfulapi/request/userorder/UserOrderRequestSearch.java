package com.wj.driving.restfulapi.request.userorder;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *  订单搜索条件
 * </p>
 *
 * @author wangjian
 * @since 2021/4/21
 */
public class UserOrderRequestSearch implements Serializable {

    /**
     * 订单编号
     */
    private Long orderNo;
    /**
     * 订单客户名称
     */
    private String userName;
    /**
     * 订单客户手机号
     */
    private String mobileNo;
    /**
     * 订单状态
     */
    private String state;
    /**
     * 订单金额-最低值
     */
    private Double minAmount;
    /**
     * 订单金额-最大值
     */
    private Double maxAmount;
    /**
     * 当前页
     */
    private Integer page;

    /**
     * 每页条数
     */
    private Integer pageSize;

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public Double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Integer getPage() {
        return page == null ? 0:(page-1)*getPageSize();
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize<0 ? 10:pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}