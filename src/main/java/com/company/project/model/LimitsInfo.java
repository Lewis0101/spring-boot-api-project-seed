package com.company.project.model;

import javax.persistence.*;

@Table(name = "limits_info")
public class LimitsInfo {
    /**
     * 权限id
     */
    @Id
    @Column(name = "limits_id")
    private Long limitsId;

    /**
     * 权限名称
     */
    @Column(name = "limits_name")
    private String limitsName;

    /**
     * 权限URL
     */
    @Column(name = "limits_url")
    private String limitsUrl;

    /**
     * 获取权限id
     *
     * @return limits_id - 权限id
     */
    public Long getLimitsId() {
        return limitsId;
    }

    /**
     * 设置权限id
     *
     * @param limitsId 权限id
     */
    public void setLimitsId(Long limitsId) {
        this.limitsId = limitsId;
    }

    /**
     * 获取权限名称
     *
     * @return limits_name - 权限名称
     */
    public String getLimitsName() {
        return limitsName;
    }

    /**
     * 设置权限名称
     *
     * @param limitsName 权限名称
     */
    public void setLimitsName(String limitsName) {
        this.limitsName = limitsName;
    }

    /**
     * 获取权限URL
     *
     * @return limits_url - 权限URL
     */
    public String getLimitsUrl() {
        return limitsUrl;
    }

    /**
     * 设置权限URL
     *
     * @param limitsUrl 权限URL
     */
    public void setLimitsUrl(String limitsUrl) {
        this.limitsUrl = limitsUrl;
    }
}