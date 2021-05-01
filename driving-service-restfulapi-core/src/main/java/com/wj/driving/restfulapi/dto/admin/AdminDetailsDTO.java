package com.wj.driving.restfulapi.dto.admin;

import java.io.Serializable;

/**
 * @ClassName AdminDTO
 * @Description
 * @Author wangjian
 * @Date 2020/12/31 16:03
 */
public class AdminDetailsDTO implements Serializable {

    private Long id;

    private String name;

    private String sex;

    private Integer age;

    private String phone;

    private String idCard;

    private String password;

    private Integer auth;

    private String authName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    @Override
    public String toString() {
        return "AdminDetailsDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", idCard='" + idCard + '\'' +
                ", password='" + password + '\'' +
                ", auth=" + auth +
                ", authName='" + authName + '\'' +
                '}';
    }
}