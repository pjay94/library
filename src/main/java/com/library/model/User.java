package com.library.model;

import java.util.Date;

public class User {
    private String nickname;
    private String password;
    private String address;
    private String phoneNumber;
    private Date creationDate;

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public User(String nickname, String password, String address, String phoneNumber, Date creationDate) {
        this.nickname = nickname;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.creationDate = creationDate;
    }
}
