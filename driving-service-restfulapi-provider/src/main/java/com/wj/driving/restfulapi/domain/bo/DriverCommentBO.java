package com.wj.driving.restfulapi.domain.bo;

import java.io.Serializable;

/**
 * <p>
 *  代驾评价实体
 * </p>
 *
 * @author wangjian
 * @since 2021/4/23
 */
public class DriverCommentBO implements Serializable {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 代驾id
     */
    private Long driverId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 用户评价
     */
    private String comments;
    /**
     * 用户评分
     */
    private Integer score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}