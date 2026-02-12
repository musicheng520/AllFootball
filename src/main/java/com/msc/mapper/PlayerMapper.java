package com.msc.mapper;

import com.msc.model.entity.Player;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlayerMapper {
    Player findById(Long id);
}
