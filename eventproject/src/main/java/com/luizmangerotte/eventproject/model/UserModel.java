package com.luizmangerotte.eventproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_db")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    @NotBlank
    private String login;
    @Column(nullable = false)
    @NotBlank
    private String senha;
    @Column(nullable = false, unique = true)
    @NotBlank
    private String email;
}
