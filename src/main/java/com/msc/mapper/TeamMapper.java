package com.msc.mapper;

import com.msc.model.entity.Team;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeamMapper {
    Team findById(Long id);
}
