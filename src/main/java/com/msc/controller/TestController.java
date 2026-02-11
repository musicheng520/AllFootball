package com.msc.controller;

import com.msc.mapper.TestMapper;
import com.msc.model.entity.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestMapper testMapper;

    @GetMapping("/{id}")
    public Test getById(@PathVariable Integer id) {
        return testMapper.findById(id);
    }
}
