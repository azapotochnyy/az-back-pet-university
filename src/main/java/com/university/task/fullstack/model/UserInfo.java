package com.university.task.fullstack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String userName;
    private String userSurName;
    private String email;
    private String password;
    private String roles;
    @ManyToMany
    @JsonIgnore
    private List<Menu> usersMenu;
    private UUID userIdentifier;
    @ManyToOne
    @JsonIgnore
    private GroupOfUsers group;
}