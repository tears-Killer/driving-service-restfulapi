package com.wj.driving.restfulapi.enums.admin;

/**
 * @EnumName AuthEnum
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 16:29
 */
public enum AuthEnum {
    普通管理员(0,"普通员工"),
    总经理(1,"组长"),
    老板(2,"总监");

    private Integer auth;

    private String authName;

    AuthEnum(Integer auth, String authName) {
        this.auth = auth;
        this.authName = authName;
    }

    public static String getSourceType(Integer auth) {
        for (AuthEnum ele : values()) {
            if(ele.auth.equals(auth)){
                return ele.authName;
            }
        }
        return null;
    }
}