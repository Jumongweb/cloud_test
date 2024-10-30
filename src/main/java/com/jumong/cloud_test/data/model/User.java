package com.jumong.cloud_test.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    private long id;
    private String email;
    private String password;
}
