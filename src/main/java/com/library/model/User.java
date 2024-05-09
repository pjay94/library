package com.library.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password; //TODO encryption
    private String city;
    private String phoneNumber;
    private Date creationDate;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String nickname, String password, String city, String phoneNumber, Date creationDate, Role role) {
        this.username = nickname;
        this.password = password;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.creationDate = creationDate;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }


}
