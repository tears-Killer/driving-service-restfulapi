package com.wj.driving.restfulapi.enums.user;

public enum UserStatusEnum {
    未下单客户(0,"未认证"),
    已下单客户(1,"已认证");

    private Integer state;

    private String userStatus;

    UserStatusEnum(Integer state, String userStatus) {
        this.state = state;
        this.userStatus = userStatus;
    }

    public static String getSourceType(Integer state) {
        for (UserStatusEnum ele : values()) {
            if(ele.state.equals(state)){
                return ele.userStatus;
            }
        }
        return null;
    }
}
