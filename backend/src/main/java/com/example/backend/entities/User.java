package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "app-user") // app-user porque a tabela user já é utilizada no postgres
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name",nullable = false)
    private String first_name;
    @Column(name = "last_name",nullable = false)
    private String last_name;
    @Column(name = "username",nullable = false,unique = true)
    private String username;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String password;

}
