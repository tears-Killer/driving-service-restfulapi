/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.utils;
import org.apache.commons.lang3.StringUtils;
/**
 * 数据隐私显示 手机号，身份证号和银行卡号等
 * @author wangkun23
 */
public class PrivacyDimmer {
    private static final String OVERLAY = "****";

    /**
     * 139****0504
     *
     * @param content
     * @return
     */
    public static String maskMobile(String content) {
        if (StringUtils.isEmpty(content)) {
            return "";
        }
        return StringUtils.overlay(content, OVERLAY, 3, 7);
    }

    /**
     * 过滤邮箱账号
     * 132****99308084911
     *
     * @param email
     * @return
     */
    public static String maskEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            return "";
        }
        String at = "@";
        if (!email.contains(at)) {
            return email;
        }
        /**
         * 这里主要逻辑是需要保留邮箱的注册商 比如@qq.com
         */
        int length = StringUtils.indexOf(email, at);
        String content = StringUtils.substring(email, 0, length);
        String mask = StringUtils.overlay(content, OVERLAY, 3, 7);
        return mask + StringUtils.substring(email, length);
    }

    /**
     * 身份证打码操作
     * 132****99308084911
     * @param idCard
     * @return
     */
    public static String maskIdCard(String idCard) {
        if (StringUtils.isEmpty(idCard)) {
            return "";
        }
        return StringUtils.overlay(idCard, OVERLAY, 4, 14);
    }
}