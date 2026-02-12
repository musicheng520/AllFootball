package com.msc.service.impl;

import com.msc.mapper.TeamMapper;
import com.msc.model.entity.Team;
import com.msc.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamMapper teamMapper;

    @Override
    public Team findById(Long id) {
        return teamMapper.findById(id);
    }
}
