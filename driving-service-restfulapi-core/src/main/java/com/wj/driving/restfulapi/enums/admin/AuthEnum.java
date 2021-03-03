package com.wj.driving.restfulapi.enums.admin;

/**
 * @EnumName AuthEnum
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 16:29
 */
public enum AuthEnum {
    普通管理员(0,"普通管理员"),
    总经理(1,"总经理"),
    老板(2,"老板");

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