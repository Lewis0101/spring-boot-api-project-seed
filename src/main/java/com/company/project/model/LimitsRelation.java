package com.company.project.model;

import javax.persistence.*;

@Table(name = "limits_relation")
public class LimitsRelation {
    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 权限id
     */
    @Column(name = "limit_id")
    private Long limitId;

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取权限id
     *
     * @return limit_id - 权限id
     */
    public Long getLimitId() {
        return limitId;
    }

    /**
     * 设置权限id
     *
     * @param limitId 权限id
     */
    public void setLimitId(Long limitId) {
        this.limitId = limitId;
    }
}