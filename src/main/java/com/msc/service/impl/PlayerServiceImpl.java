package com.msc.service.impl;

import com.msc.mapper.FixtureMapper;
import com.msc.mapper.PlayerMapper;
import com.msc.model.entity.Player;
import com.msc.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    private final PlayerMapper playerMapper;

    @Override
    public Player findById(Long id) {
        return playerMapper.findById(id);
    }
}
