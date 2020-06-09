package org.lewis.management.system.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "personnel_train")
public class PersonnelTrain {
    /**
     * 员工编号
     */
    @Id
    @Column(name = "personnel_id")
    private String personnelId;

    /**
     * 培训日期
     */
    @Column(name = "train_date")
    private Date trainDate;

    /**
     * 培训内容
     */
    @Column(name = "train_content")
    private String trainContent;

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
     * 获取培训日期
     *
     * @return train_date - 培训日期
     */
    public Date getTrainDate() {
        return trainDate;
    }

    /**
     * 设置培训日期
     *
     * @param trainDate 培训日期
     */
    public void setTrainDate(Date trainDate) {
        this.trainDate = trainDate;
    }

    /**
     * 获取培训内容
     *
     * @return train_content - 培训内容
     */
    public String getTrainContent() {
        return trainContent;
    }

    /**
     * 设置培训内容
     *
     * @param trainContent 培训内容
     */
    public void setTrainContent(String trainContent) {
        this.trainContent = trainContent;
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