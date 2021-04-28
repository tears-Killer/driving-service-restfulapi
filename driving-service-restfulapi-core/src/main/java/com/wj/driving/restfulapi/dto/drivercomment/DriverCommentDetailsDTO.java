package com.wj.driving.restfulapi.dto.drivercomment;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *  代驾评价返回参数
 * </p>
 *
 * @author wangjian
 * @since 2021/4/27
 */
public class DriverCommentDetailsDTO implements Serializable {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 评价者手机号
     */
    private String phone;
    /**
     * 评价订单号
     */
    private Long orderNo;
    /**
     * 评价内容
     */
    private String comments;
    /**
     * 评价分数
     */
    private Integer score;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后更新时间
     */
    private Date lastUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}