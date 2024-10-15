package com.university.task.fullstack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuCreateRequestDto {
    MenuDto menu;
    List<UUID> userIdentificators;
}
