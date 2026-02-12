package com.msc.service.impl;

import com.msc.mapper.FixtureMapper;
import com.msc.model.entity.Fixture;
import com.msc.service.FixtureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FixtureServiceImpl implements FixtureService {

    private final FixtureMapper fixtureMapper;

    @Override
    public Fixture getById(Long id) {
       return fixtureMapper.findById(id);
    }
}
