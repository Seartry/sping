package com.pactera.sys.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class SysUser {
    /**
     * 排除生成json不需要的字段
     * 1 @JSONField(serialize = false)
     * 2 使用关键字（transient）修饰字段
     */
    @JSONField(serialize = false)
    private Long userId;

    private String userName;

    private String userPhone;

    @JSONField(serialize = false)
    private String userPassword;

    private transient String roleCode;

    private String userNickname;

    /**
     * 日期格式化
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date createdTime;
    @JSONField(format = "yyyy-MM-dd")
    private Date modifiedTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}