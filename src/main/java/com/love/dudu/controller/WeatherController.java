package com.love.dudu.controller;

import com.love.dudu.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class WeatherController {

    @Resource
    private WeatherService weatherService;

    @GetMapping("get-one")
    public String getOne() {
        return weatherService.getOneSubject();
    }

    @GetMapping("steal-one")
    public String stealOne() {
        return weatherService.stealSubject();
    }

    @PostMapping("send")
    public void send() {
        weatherService.sendWeatherMail();
    }
}
