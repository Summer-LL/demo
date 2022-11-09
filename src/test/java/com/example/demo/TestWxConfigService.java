package com.example.demo;

import com.example.demo.service.WxConfigService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class TestWxConfigService {
    @Autowired
    private WxConfigService wxConfigService = new WxConfigService();

    @Test
    void get() {
        System.out.println(wxConfigService.get());
    }
}