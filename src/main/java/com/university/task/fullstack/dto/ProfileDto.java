package com.university.task.fullstack.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class ProfileDto {
    private String name;
    private String userName;
    private String userSurName;
    private String email;
    private String roles;
    private UUID userIdentifier;
}
