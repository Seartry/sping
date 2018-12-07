package com.pactera.sys.model;

import java.util.Date;

public class UserRole {
    private Integer roleId;

    private String roleCode;

    private String roleName;

    private Date createTime;

    private Date modifedTime;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifedTime() {
        return modifedTime;
    }

    public void setModifedTime(Date modifedTime) {
        this.modifedTime = modifedTime;
    }
}