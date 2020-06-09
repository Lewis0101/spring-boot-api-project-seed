package org.lewis.management.system.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "personnel_remove")
public class PersonnelRemove {
    /**
     * 员工编号
     */
    @Id
    @Column(name = "personnel_id")
    private String personnelId;

    /**
     * 调后部门
     */
    @Column(name = "after_remove_deparment")
    private String afterRemoveDeparment;

    /**
     * 调后职位
     */
    @Column(name = "after_remove_job")
    private String afterRemoveJob;

    /**
     * 调动日期
     */
    @Column(name = "remove_date")
    private Date removeDate;

    /**
     * 调动原因
     */
    @Column(name = "remove_reason")
    private String removeReason;

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
     * 获取调后部门
     *
     * @return after_remove_deparment - 调后部门
     */
    public String getAfterRemoveDeparment() {
        return afterRemoveDeparment;
    }

    /**
     * 设置调后部门
     *
     * @param afterRemoveDeparment 调后部门
     */
    public void setAfterRemoveDeparment(String afterRemoveDeparment) {
        this.afterRemoveDeparment = afterRemoveDeparment;
    }

    /**
     * 获取调后职位
     *
     * @return after_remove_job - 调后职位
     */
    public String getAfterRemoveJob() {
        return afterRemoveJob;
    }

    /**
     * 设置调后职位
     *
     * @param afterRemoveJob 调后职位
     */
    public void setAfterRemoveJob(String afterRemoveJob) {
        this.afterRemoveJob = afterRemoveJob;
    }

    /**
     * 获取调动日期
     *
     * @return remove_date - 调动日期
     */
    public Date getRemoveDate() {
        return removeDate;
    }

    /**
     * 设置调动日期
     *
     * @param removeDate 调动日期
     */
    public void setRemoveDate(Date removeDate) {
        this.removeDate = removeDate;
    }

    /**
     * 获取调动原因
     *
     * @return remove_reason - 调动原因
     */
    public String getRemoveReason() {
        return removeReason;
    }

    /**
     * 设置调动原因
     *
     * @param removeReason 调动原因
     */
    public void setRemoveReason(String removeReason) {
        this.removeReason = removeReason;
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