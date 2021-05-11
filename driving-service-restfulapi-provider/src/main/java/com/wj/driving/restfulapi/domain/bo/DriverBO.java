package com.wj.driving.restfulapi.domain.bo;

import java.io.Serializable;

/**
 * <p>
 *  代驾实体
 * </p>
 *
 * @author wangjian
 * @since 2021/4/23
 */
public class DriverBO implements Serializable {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     *性别
     */
    private String sex;
    /**
     *年龄
     */
    private Integer age;
    /**
     *手机号
     */
    private String phone;
    /**
     *身份证号
     */
    private Long idCard;
    /**
     *等级
     */
    private Integer starLevel;
    /**
     * 驾照图片
     */
    private String licenseImg;
    /**
     *状态
     */
    private Integer state;

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

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
    }

    public Integer getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
    }

    public String getLicenseImg() {
        return licenseImg;
    }

    public void setLicenseImg(String licenseImg) {
        this.licenseImg = licenseImg;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}