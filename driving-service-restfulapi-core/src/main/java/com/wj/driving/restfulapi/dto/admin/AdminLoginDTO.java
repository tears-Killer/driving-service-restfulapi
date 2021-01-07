package com.wj.driving.restfulapi.dto.admin;

import java.io.Serializable;

/**
 * @ClassName AdminLoginDTO
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 16:11
 */
public class AdminLoginDTO implements Serializable{

    private String phone;
    private String password;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}