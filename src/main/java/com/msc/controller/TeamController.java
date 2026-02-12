package com.msc.controller;

import com.msc.model.entity.Team;
import com.msc.result.Result;
import com.msc.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @GetMapping("/{id}")
    public Result<Team> getById(@PathVariable Long id) {
        return Result.success(teamService.findById(id));
    }
}
