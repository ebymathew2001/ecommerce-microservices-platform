package com.ecommerce.user_service.entity;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    @Column(unique = true)
    public String email;

    public String password;

    @Enumerated(EnumType.STRING)
    public Role role;

}
