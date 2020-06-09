package org.lewis.management.system.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "personnel_appraise")
public class PersonnelAppraise {
    /**
     * 员工主键
     */
    @Id
    @Column(name = "personnel_id")
    private String personnelId;

    /**
     * 评价日期
     */
    @Column(name = "appraise_date")
    private Date appraiseDate;

    /**
     * 考评结果
     */
    @Column(name = "appraise_result")
    private String appraiseResult;

    /**
     * 培训内容
     */
    @Column(name = "appraise_content")
    private String appraiseContent;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取员工主键
     *
     * @return personnel_id - 员工主键
     */
    public String getPersonnelId() {
        return personnelId;
    }

    /**
     * 设置员工主键
     *
     * @param personnelId 员工主键
     */
    public void setPersonnelId(String personnelId) {
        this.personnelId = personnelId;
    }

    /**
     * 获取评价日期
     *
     * @return appraise_date - 评价日期
     */
    public Date getAppraiseDate() {
        return appraiseDate;
    }

    /**
     * 设置评价日期
     *
     * @param appraiseDate 评价日期
     */
    public void setAppraiseDate(Date appraiseDate) {
        this.appraiseDate = appraiseDate;
    }

    /**
     * 获取考评结果
     *
     * @return appraise_result - 考评结果
     */
    public String getAppraiseResult() {
        return appraiseResult;
    }

    /**
     * 设置考评结果
     *
     * @param appraiseResult 考评结果
     */
    public void setAppraiseResult(String appraiseResult) {
        this.appraiseResult = appraiseResult;
    }

    /**
     * 获取培训内容
     *
     * @return appraise_content - 培训内容
     */
    public String getAppraiseContent() {
        return appraiseContent;
    }

    /**
     * 设置培训内容
     *
     * @param appraiseContent 培训内容
     */
    public void setAppraiseContent(String appraiseContent) {
        this.appraiseContent = appraiseContent;
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