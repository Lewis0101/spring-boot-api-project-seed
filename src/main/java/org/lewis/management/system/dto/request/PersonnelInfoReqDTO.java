package org.lewis.management.system.dto.request;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PersonnelInfoReqDTO {
    /**
     * 员工编号
     */
    @Id
    @Column(name = "personnel_id")
    private String personnelId;

    /**
     * 员工姓名
     */
    @Column(name = "personnel_name")
    private String personnelName;

    /**
     * 员工性别
     */
    @Column(name = "personnel_sex")
    private String personnelSex;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 身份证号码
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 婚姻状况
     */
    private String wedlock;

    /**
     * 民族
     */
    private String race;

    /**
     * 籍贯
     */
    @Column(name = "native_place")
    private String nativePlace;

    /**
     * 整治面貌
     */
    private String politic;

    /**
     * 电子邮箱
     */
    @Column(name = "e_mail")
    private String eMail;

    /**
     * 联系电话
     */
    private Long phone;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 部门
     */
    private String department;

    /**
     * 职位
     */
    private String job;

    /**
     * 职称
     */
    private String duty;

    /**
     * 基本工资
     */
    @Column(name = "base_salary")
    private Integer baseSalary;

    /**
     * 聘用形式
     */
    @Column(name = "engage_form")
    private String engageForm;

    /**
     * 最高学历
     */
    @Column(name = "tiptop_degree")
    private String tiptopDegree;

    /**
     * 所属专业
     */
    private String specialty;

    /**
     * 毕业院校
     */
    private String school;

    /**
     * 入职时间
     */
    @Column(name = "begin_work_date")
    private Date beginWorkDate;

    /**
     * 在职状态
     */
    @Column(name = "work_state")
    private String workState;

    /**
     * 工号
     */
    @Column(name = "work_id")
    private Integer workId;

    /**
     * 合同期限
     */
    @Column(name = "contract_term")
    private Short contractTerm;

    /**
     * 转正日期
     */
    @Column(name = "be_form_date")
    private Date beFormDate;

    /**
     * 离职日期
     */
    @Column(name = "not_work_date")
    private Date notWorkDate;

    /**
     * 合同起始日期
     */
    @Column(name = "begin_contract")
    private Date beginContract;

    /**
     * 合同终止时期
     */
    @Column(name = "end_contract")
    private Date endContract;

    /**
     * 工龄
     */
    @Column(name = "work_age")
    private Short workAge;

    /**
     * 删除状态，0：正常，1：已删除
     */
    @Column(name = "is_deleted")
    private Short isDeleted;

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
     * 获取员工姓名
     *
     * @return personnel_name - 员工姓名
     */
    public String getPersonnelName() {
        return personnelName;
    }

    /**
     * 设置员工姓名
     *
     * @param personnelName 员工姓名
     */
    public void setPersonnelName(String personnelName) {
        this.personnelName = personnelName;
    }

    /**
     * 获取员工性别
     *
     * @return personnel_sex - 员工性别
     */
    public String getPersonnelSex() {
        return personnelSex;
    }

    /**
     * 设置员工性别
     *
     * @param personnelSex 员工性别
     */
    public void setPersonnelSex(String personnelSex) {
        this.personnelSex = personnelSex;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取身份证号码
     *
     * @return id - 身份证号码
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置身份证号码
     *
     * @param id 身份证号码
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取婚姻状况
     *
     * @return wedlock - 婚姻状况
     */
    public String getWedlock() {
        return wedlock;
    }

    /**
     * 设置婚姻状况
     *
     * @param wedlock 婚姻状况
     */
    public void setWedlock(String wedlock) {
        this.wedlock = wedlock;
    }

    /**
     * 获取民族
     *
     * @return race - 民族
     */
    public String getRace() {
        return race;
    }

    /**
     * 设置民族
     *
     * @param race 民族
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * 获取籍贯
     *
     * @return native_place - 籍贯
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * 设置籍贯
     *
     * @param nativePlace 籍贯
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    /**
     * 获取整治面貌
     *
     * @return politic - 整治面貌
     */
    public String getPolitic() {
        return politic;
    }

    /**
     * 设置整治面貌
     *
     * @param politic 整治面貌
     */
    public void setPolitic(String politic) {
        this.politic = politic;
    }

    /**
     * 获取电子邮箱
     *
     * @return e_mail - 电子邮箱
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * 设置电子邮箱
     *
     * @param eMail 电子邮箱
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * 获取联系地址
     *
     * @return address - 联系地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置联系地址
     *
     * @param address 联系地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取部门
     *
     * @return department - 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门
     *
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取职位
     *
     * @return job - 职位
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置职位
     *
     * @param job 职位
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 获取职称
     *
     * @return duty - 职称
     */
    public String getDuty() {
        return duty;
    }

    /**
     * 设置职称
     *
     * @param duty 职称
     */
    public void setDuty(String duty) {
        this.duty = duty;
    }

    /**
     * 获取基本工资
     *
     * @return base_salary - 基本工资
     */
    public Integer getBaseSalary() {
        return baseSalary;
    }

    /**
     * 设置基本工资
     *
     * @param baseSalary 基本工资
     */
    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * 获取聘用形式
     *
     * @return engage_form - 聘用形式
     */
    public String getEngageForm() {
        return engageForm;
    }

    /**
     * 设置聘用形式
     *
     * @param engageForm 聘用形式
     */
    public void setEngageForm(String engageForm) {
        this.engageForm = engageForm;
    }

    /**
     * 获取最高学历
     *
     * @return tiptop_degree - 最高学历
     */
    public String getTiptopDegree() {
        return tiptopDegree;
    }

    /**
     * 设置最高学历
     *
     * @param tiptopDegree 最高学历
     */
    public void setTiptopDegree(String tiptopDegree) {
        this.tiptopDegree = tiptopDegree;
    }

    /**
     * 获取所属专业
     *
     * @return specialty - 所属专业
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * 设置所属专业
     *
     * @param specialty 所属专业
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * 获取毕业院校
     *
     * @return school - 毕业院校
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置毕业院校
     *
     * @param school 毕业院校
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取入职时间
     *
     * @return begin_work_date - 入职时间
     */
    public Date getBeginWorkDate() {
        return beginWorkDate;
    }

    /**
     * 设置入职时间
     *
     * @param beginWorkDate 入职时间
     */
    public void setBeginWorkDate(Date beginWorkDate) {
        this.beginWorkDate = beginWorkDate;
    }

    /**
     * 获取在职状态
     *
     * @return work_state - 在职状态
     */
    public String getWorkState() {
        return workState;
    }

    /**
     * 设置在职状态
     *
     * @param workState 在职状态
     */
    public void setWorkState(String workState) {
        this.workState = workState;
    }

    /**
     * 获取工号
     *
     * @return work_id - 工号
     */
    public Integer getWorkId() {
        return workId;
    }

    /**
     * 设置工号
     *
     * @param workId 工号
     */
    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    /**
     * 获取合同期限
     *
     * @return contract_term - 合同期限
     */
    public Short getContractTerm() {
        return contractTerm;
    }

    /**
     * 设置合同期限
     *
     * @param contractTerm 合同期限
     */
    public void setContractTerm(Short contractTerm) {
        this.contractTerm = contractTerm;
    }

    /**
     * 获取转正日期
     *
     * @return be_form_date - 转正日期
     */
    public Date getBeFormDate() {
        return beFormDate;
    }

    /**
     * 设置转正日期
     *
     * @param beFormDate 转正日期
     */
    public void setBeFormDate(Date beFormDate) {
        this.beFormDate = beFormDate;
    }

    /**
     * 获取离职日期
     *
     * @return not_work_date - 离职日期
     */
    public Date getNotWorkDate() {
        return notWorkDate;
    }

    /**
     * 设置离职日期
     *
     * @param notWorkDate 离职日期
     */
    public void setNotWorkDate(Date notWorkDate) {
        this.notWorkDate = notWorkDate;
    }

    /**
     * 获取合同起始日期
     *
     * @return begin_contract - 合同起始日期
     */
    public Date getBeginContract() {
        return beginContract;
    }

    /**
     * 设置合同起始日期
     *
     * @param beginContract 合同起始日期
     */
    public void setBeginContract(Date beginContract) {
        this.beginContract = beginContract;
    }

    /**
     * 获取合同终止时期
     *
     * @return end_contract - 合同终止时期
     */
    public Date getEndContract() {
        return endContract;
    }

    /**
     * 设置合同终止时期
     *
     * @param endContract 合同终止时期
     */
    public void setEndContract(Date endContract) {
        this.endContract = endContract;
    }

    /**
     * 获取工龄
     *
     * @return work_age - 工龄
     */
    public Short getWorkAge() {
        return workAge;
    }

    /**
     * 设置工龄
     *
     * @param workAge 工龄
     */
    public void setWorkAge(Short workAge) {
        this.workAge = workAge;
    }

    /**
     * 获取删除状态，0：正常，1：已删除
     *
     * @return is_deleted - 删除状态，0：正常，1：已删除
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置删除状态，0：正常，1：已删除
     *
     * @param isDeleted 删除状态，0：正常，1：已删除
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }
}