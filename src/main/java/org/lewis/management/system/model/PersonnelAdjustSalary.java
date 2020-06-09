package org.lewis.management.system.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "personnel_adjust_salary")
public class PersonnelAdjustSalary {
    /**
     * 员工编号
     */
    @Id
    @Column(name = "personnel_id")
    private String personnelId;

    /**
     * 调薪日期
     */
    @Column(name = "adjust_salary_date")
    private Date adjustSalaryDate;

    /**
     * 调前薪资
     */
    @Column(name = "before_adjust_salary")
    private Integer beforeAdjustSalary;

    /**
     * 调后薪资
     */
    @Column(name = "after_adjust_salary")
    private Integer afterAdjustSalary;

    /**
     * 调薪原因
     */
    @Column(name = "adjust_salary_reason")
    private String adjustSalaryReason;

    /**
     * 备注
     */
    private String remark;

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
     * 获取调薪日期
     *
     * @return adjust_salary_date - 调薪日期
     */
    public Date getAdjustSalaryDate() {
        return adjustSalaryDate;
    }

    /**
     * 设置调薪日期
     *
     * @param adjustSalaryDate 调薪日期
     */
    public void setAdjustSalaryDate(Date adjustSalaryDate) {
        this.adjustSalaryDate = adjustSalaryDate;
    }

    /**
     * 获取调前薪资
     *
     * @return before_adjust_salary - 调前薪资
     */
    public Integer getBeforeAdjustSalary() {
        return beforeAdjustSalary;
    }

    /**
     * 设置调前薪资
     *
     * @param beforeAdjustSalary 调前薪资
     */
    public void setBeforeAdjustSalary(Integer beforeAdjustSalary) {
        this.beforeAdjustSalary = beforeAdjustSalary;
    }

    /**
     * 获取调后薪资
     *
     * @return after_adjust_salary - 调后薪资
     */
    public Integer getAfterAdjustSalary() {
        return afterAdjustSalary;
    }

    /**
     * 设置调后薪资
     *
     * @param afterAdjustSalary 调后薪资
     */
    public void setAfterAdjustSalary(Integer afterAdjustSalary) {
        this.afterAdjustSalary = afterAdjustSalary;
    }

    /**
     * 获取调薪原因
     *
     * @return adjust_salary_reason - 调薪原因
     */
    public String getAdjustSalaryReason() {
        return adjustSalaryReason;
    }

    /**
     * 设置调薪原因
     *
     * @param adjustSalaryReason 调薪原因
     */
    public void setAdjustSalaryReason(String adjustSalaryReason) {
        this.adjustSalaryReason = adjustSalaryReason;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}