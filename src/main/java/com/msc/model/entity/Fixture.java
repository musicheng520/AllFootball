package com.msc.model.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Fixture {
    private Long id;
    private Long leagueId;
    private String homeTeam;
    private String awayTeam;
    private LocalDateTime matchTime;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}