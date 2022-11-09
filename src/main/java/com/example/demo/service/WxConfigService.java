package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

/**
 * @author zhoutianlan
 * @since 2022/10/25
 */
@Service
public class WxConfigService {
    @Value("${wx.miniapp.configs.appid}")
    private String APPID;
    public String get(){
        return APPID;
    }

}
