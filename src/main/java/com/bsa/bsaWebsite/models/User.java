package com.bsa.bsaWebsite.models;


import com.bsa.bsaWebsite.controllers.validation.PasswordMatches;
import com.bsa.bsaWebsite.controllers.validation.ValidEmail;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Size;


import javax.persistence.*;
import java.util.Date;

@PasswordMatches
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    @Size(min = 3, max = 24)
    private String username;

    @ValidEmail
    @Column(nullable = false)
    @JsonIgnore
    @Size(min = 8, max = 50)
    private String password;

    @Transient
    private String matchingPassword;

    private String url;

    public User(){}

    public User(long id, String email, String username, String password,
                String matchingPassword, String url){
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.matchingPassword = matchingPassword;
        this.url = url;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
