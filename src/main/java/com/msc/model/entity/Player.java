package com.msc.model.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Player {
    private Long id;
    private Long teamId;
    private String name;
    private String firstname;
    private String lastname;
    private Integer age;
    private String nationality;
    private String position;
    private String photo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
