package org.lewis.management.system.model;

import javax.persistence.*;

public class Salary {
    /**
     * 员工编号
     */
    @Id
    @Column(name = "personnel_id")
    private String personnelId;

    /**
     * 奖金
     */
    private Integer bonus;

    /**
     * 午餐补助
     */
    @Column(name = "lunch_salary")
    private Integer lunchSalary;

    /**
     * 交通补助
     */
    @Column(name = "traffic_salary")
    private Integer trafficSalary;

    /**
     * 基本工资
     */
    @Column(name = "basis_salary")
    private Integer basisSalary;

    /**
     * 总工资
     */
    private Integer total;

    /**
     * 获取员工编号
     *
     * @return personnel_id - 员工编号
     */
    public String getPersonnelId() {
        return personnelId;
    }

    /**
     * 设置员工编号
     *
     * @param personnelId 员工编号
     */
    public void setPersonnelId(String personnelId) {
        this.personnelId = personnelId;
    }

    /**
     * 获取奖金
     *
     * @return bonus - 奖金
     */
    public Integer getBonus() {
        return bonus;
    }

    /**
     * 设置奖金
     *
     * @param bonus 奖金
     */
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    /**
     * 获取午餐补助
     *
     * @return lunch_salary - 午餐补助
     */
    public Integer getLunchSalary() {
        return lunchSalary;
    }

    /**
     * 设置午餐补助
     *
     * @param lunchSalary 午餐补助
     */
    public void setLunchSalary(Integer lunchSalary) {
        this.lunchSalary = lunchSalary;
    }

    /**
     * 获取交通补助
     *
     * @return traffic_salary - 交通补助
     */
    public Integer getTrafficSalary() {
        return trafficSalary;
    }

    /**
     * 设置交通补助
     *
     * @param trafficSalary 交通补助
     */
    public void setTrafficSalary(Integer trafficSalary) {
        this.trafficSalary = trafficSalary;
    }

    /**
     * 获取基本工资
     *
     * @return basis_salary - 基本工资
     */
    public Integer getBasisSalary() {
        return basisSalary;
    }

    /**
     * 设置基本工资
     *
     * @param basisSalary 基本工资
     */
    public void setBasisSalary(Integer basisSalary) {
        this.basisSalary = basisSalary;
    }

    /**
     * 获取总工资
     *
     * @return total - 总工资
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 设置总工资
     *
     * @param total 总工资
     */
    public void setTotal(Integer total) {
        this.total = total;
    }
}