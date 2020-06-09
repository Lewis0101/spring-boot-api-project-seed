package org.lewis.management.system.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "personnel_encouragement")
public class PersonnelEncouragement {
    /**
     * 员工编号
     */
    @Id
    @Column(name = "personnel_id")
    private String personnelId;

    /**
     * 奖罚日期
     */
    @Column(name = "personnel_enc_or_chast_date")
    private Date personnelEncOrChastDate;

    /**
     * 奖罚原因
     */
    @Column(name = "personnel_enc_or_chast_reason")
    private String personnelEncOrChastReason;

    /**
     * 奖罚分
     */
    @Column(name = "personnel_enc_or_chast_point")
    private String personnelEncOrChastPoint;

    /**
     * 奖罚类别
     */
    @Column(name = "personnel_enc_or_chast_sort")
    private String personnelEncOrChastSort;

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
     * 获取奖罚日期
     *
     * @return personnel_enc_or_chast_date - 奖罚日期
     */
    public Date getPersonnelEncOrChastDate() {
        return personnelEncOrChastDate;
    }

    /**
     * 设置奖罚日期
     *
     * @param personnelEncOrChastDate 奖罚日期
     */
    public void setPersonnelEncOrChastDate(Date personnelEncOrChastDate) {
        this.personnelEncOrChastDate = personnelEncOrChastDate;
    }

    /**
     * 获取奖罚原因
     *
     * @return personnel_enc_or_chast_reason - 奖罚原因
     */
    public String getPersonnelEncOrChastReason() {
        return personnelEncOrChastReason;
    }

    /**
     * 设置奖罚原因
     *
     * @param personnelEncOrChastReason 奖罚原因
     */
    public void setPersonnelEncOrChastReason(String personnelEncOrChastReason) {
        this.personnelEncOrChastReason = personnelEncOrChastReason;
    }

    /**
     * 获取奖罚分
     *
     * @return personnel_enc_or_chast_point - 奖罚分
     */
    public String getPersonnelEncOrChastPoint() {
        return personnelEncOrChastPoint;
    }

    /**
     * 设置奖罚分
     *
     * @param personnelEncOrChastPoint 奖罚分
     */
    public void setPersonnelEncOrChastPoint(String personnelEncOrChastPoint) {
        this.personnelEncOrChastPoint = personnelEncOrChastPoint;
    }

    /**
     * 获取奖罚类别
     *
     * @return personnel_enc_or_chast_sort - 奖罚类别
     */
    public String getPersonnelEncOrChastSort() {
        return personnelEncOrChastSort;
    }

    /**
     * 设置奖罚类别
     *
     * @param personnelEncOrChastSort 奖罚类别
     */
    public void setPersonnelEncOrChastSort(String personnelEncOrChastSort) {
        this.personnelEncOrChastSort = personnelEncOrChastSort;
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