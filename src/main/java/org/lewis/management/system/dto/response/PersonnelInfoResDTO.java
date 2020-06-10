package org.lewis.management.system.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

import lombok.Data;

@Data
public class PersonnelInfoResDTO {
    /**
     * 员工编号
     */
    @JsonProperty("personnel_id")
    private String personnelId;

    /**
     * 员工姓名
     */
    @JsonProperty("personnel_name")
    private String personnelName;

    /**
     * 员工性别
     */
    @JsonProperty("personnel_sex")
    private String personnelSex;

    /**
     * 出生日期
     */
    @JsonProperty("birthday")
    private Date birthday;

    /**
     * 身份证号码
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 婚姻状况
     */
    @JsonProperty("wedlock")
    private String wedlock;

    /**
     * 民族
     */
    @JsonProperty("race")
    private String race;

    /**
     * 籍贯
     */
    @JsonProperty("native_place")
    private String nativePlace;

    /**
     * 整治面貌
     */
    @JsonProperty("politic")
    private String politic;

    /**
     * 电子邮箱
     */
    @JsonProperty("e_mail")
    private String eMail;

    /**
     * 联系电话
     */
    @JsonProperty("phone")
    private Long phone;

    /**
     * 联系地址
     */
    @JsonProperty("address")
    private String address;

    /**
     * 部门
     */
    @JsonProperty("department")
    private String department;

    /**
     * 职位
     */
    @JsonProperty("job")
    private String job;

    /**
     * 职称
     */
    @JsonProperty("duty")
    private String duty;

    /**
     * 基本工资
     */
    @JsonProperty("base_salary")
    private Integer baseSalary;

    /**
     * 聘用形式
     */
    @JsonProperty("engage_form")
    private String engageForm;

    /**
     * 最高学历
     */
    @JsonProperty("tiptop_degree")
    private String tiptopDegree;

    /**
     * 所属专业
     */
    @JsonProperty("specialty")
    private String specialty;

    /**
     * 毕业院校
     */
    @JsonProperty("school")
    private String school;

    /**
     * 入职时间
     */
    @JsonProperty("begin_work_date")
    private Date beginWorkDate;

    /**
     * 在职状态
     */
    @JsonProperty("work_state")
    private String workState;

    /**
     * 工号
     */
    @JsonProperty("work_id")
    private Integer workId;

    /**
     * 合同期限
     */
    @JsonProperty("contract_term")
    private Short contractTerm;

    /**
     * 转正日期
     */
    @JsonProperty("be_form_date")
    private Date beFormDate;

    /**
     * 离职日期
     */
    @JsonProperty("not_work_date")
    private Date notWorkDate;

    /**
     * 合同起始日期
     */
    @JsonProperty("begin_contract")
    private Date beginContract;

    /**
     * 合同终止时期
     */
    @JsonProperty("end_contract")
    private Date endContract;

    /**
     * 工龄
     */
    @JsonProperty("work_age")
    private Short workAge;

    /**
     * 删除状态，0：正常，1：已删除
     */
    @JsonProperty("is_deleted")
    private Short isDeleted;

}