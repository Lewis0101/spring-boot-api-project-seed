package com.company.project.model;

import javax.persistence.*;

@Table(name = "person_info")
public class PersonInfo {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 身份证号
     */
    @Column(name = "id_number")
    private String idNumber;

    /**
     * 证件类型，1：身份证，2：警官证，3：医保卡
     */
    @Column(name = "card_type")
    private String cardType;

    /**
     * 现住址
     */
    private String address;

    /**
     * 籍贯
     */
    @Column(name = "register_address")
    private String registerAddress;

    /**
     * 毕业院校
     */
    @Column(name = "graduated_school")
    private String graduatedSchool;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户姓名
     *
     * @return name - 用户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户姓名
     *
     * @param name 用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取身份证号
     *
     * @return id_number - 身份证号
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置身份证号
     *
     * @param idNumber 身份证号
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * 获取证件类型，1：身份证，2：警官证，3：医保卡
     *
     * @return card_type - 证件类型，1：身份证，2：警官证，3：医保卡
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设置证件类型，1：身份证，2：警官证，3：医保卡
     *
     * @param cardType 证件类型，1：身份证，2：警官证，3：医保卡
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * 获取现住址
     *
     * @return address - 现住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置现住址
     *
     * @param address 现住址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取籍贯
     *
     * @return register_address - 籍贯
     */
    public String getRegisterAddress() {
        return registerAddress;
    }

    /**
     * 设置籍贯
     *
     * @param registerAddress 籍贯
     */
    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    /**
     * 获取毕业院校
     *
     * @return graduated_school - 毕业院校
     */
    public String getGraduatedSchool() {
        return graduatedSchool;
    }

    /**
     * 设置毕业院校
     *
     * @param graduatedSchool 毕业院校
     */
    public void setGraduatedSchool(String graduatedSchool) {
        this.graduatedSchool = graduatedSchool;
    }
}