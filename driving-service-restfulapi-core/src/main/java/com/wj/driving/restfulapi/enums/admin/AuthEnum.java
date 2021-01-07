package com.wj.driving.restfulapi.enums.admin;

/**
 * @EnumName AuthEnum
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 16:29
 */
public enum AuthEnum {
    普通管理员(0),
    总经理(1),
    老板(2);

    private Integer auth;

    AuthEnum(Integer auth) {
        this.auth = auth;
    }

    public Integer getAuth() {
        return auth;
    }
}