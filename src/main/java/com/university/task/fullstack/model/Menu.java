package com.university.task.fullstack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String breakfast;
    private String lunchOne;
    private String dinner;
    private String lunchTwo;
    private String supper;
    private String lunchThree;
    private String date;
    @ManyToMany
    private List<UserInfo> users;
}
