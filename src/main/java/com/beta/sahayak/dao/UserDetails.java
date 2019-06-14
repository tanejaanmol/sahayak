package com.beta.sahayak.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("sahayak")
public class UserDetails {
    @Id
    @Column(value="emailid")
    private String emailId;

    public UserDetails(String emailId, String name) {
        this.emailId = emailId;
        this.name = name;
    }

    @Column(value="name")
    private String name;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
