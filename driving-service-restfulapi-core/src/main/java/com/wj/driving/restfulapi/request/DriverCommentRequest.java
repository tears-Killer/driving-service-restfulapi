package com.wj.driving.restfulapi.request;

import java.io.Serializable;

/**
 * <p>
 *  评价
 * </p>
 *
 * @author wangjian
 * @since 2021/4/27
 */
public class DriverCommentRequest implements Serializable {

    /**
     * 代驾id
     */
    private Long driverId;

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }
}