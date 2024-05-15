package com.example.loginauthapi.domain.user;

import jakarta.persistence.Table;
import jdk.internal.vm.annotation.Stable;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType=UUID)
    private String id;
    private String name;
    private String email;
    private String password;


}
