package com.pingchuan.feign.impl;

import com.pingchuan.entity.Student;
import com.pingchuan.feign.FeignProviderClient;

import java.util.Collection;
import org.springframework.stereotype.Component;

@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }
}