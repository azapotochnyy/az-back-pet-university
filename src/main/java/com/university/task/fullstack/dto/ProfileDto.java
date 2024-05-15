package com.university.task.fullstack.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProfileDto {
    private String name;
    private String userName;
    private String userSurName;
    private String email;
    private String roles;
}
