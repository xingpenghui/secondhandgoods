package com.qfedu.admin.entity;

import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-07
 */
@Data
public class User{

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private Integer flag;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", flag=" + flag +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
