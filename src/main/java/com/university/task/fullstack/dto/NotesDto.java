package com.university.task.fullstack.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class NotesDto {
    String text;
    String date;
}
