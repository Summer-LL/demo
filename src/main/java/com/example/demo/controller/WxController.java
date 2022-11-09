package com.example.demo.controller;

import com.example.demo.service.WxConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoutianlan
 * @since 2022/10/25
 */
@RestController
public class WxController {
    @Autowired
    private WxConfigService wxConfigService;

    @GetMapping("/test")
    public String test(){
        return wxConfigService.get();
    }
}
