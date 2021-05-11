package com.wj.driving.restfulapi.enums.driver;

public enum DriverAuditStateEnum {
    待审核(0,"待审核"),
    未通过(1,"未通过");

    private Integer value;

    private String auditState;

    DriverAuditStateEnum(Integer value, String auditState) {
        this.value = value;
        this.auditState = auditState;
    }

    public static String getSourceType(Integer state) {
        for (DriverAuditStateEnum ele : values()) {
            if(ele.value.equals(state)){
                return ele.auditState;
            }
        }
        return null;
    }
}
