package com.msc.model.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Team {
    private Long id;
    private String name;
    private String country;
    private String logo;
    private String venueName;
    private String venueCity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}