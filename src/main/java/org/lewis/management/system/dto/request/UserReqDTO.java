package org.lewis.management.system.dto.request;


import org.hibernate.validator.constraints.NotBlank;


public class UserReqDTO {

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    private String name;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}