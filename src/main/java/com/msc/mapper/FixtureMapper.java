package com.msc.mapper;

import com.msc.model.entity.Fixture;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FixtureMapper {
    Fixture findById(Long id);
}
