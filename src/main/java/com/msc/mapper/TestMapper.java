package com.msc.mapper;

import com.msc.model.entity.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    Test findById(Integer id);
}
