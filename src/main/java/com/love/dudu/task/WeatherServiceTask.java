package com.love.dudu.task;

import com.love.dudu.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class WeatherServiceTask {

    @Resource
    private WeatherService weatherService;

    /**
     * 发送邮件 定时任务
     */
    @Scheduled(cron = "0 15 7 * * ?")
    public void sendWeatherMail() {
        log.info(">>>>> send weather mail start");
        weatherService.sendWeatherMail();
        log.info("<<<<< send weather mail end");
    }

    @Scheduled(cron = "0 0/3 8 * * ?")
    public void stealSubject() {
        log.info(">>>>> steal subject start");
        weatherService.stealSubject();
        log.info("<<<<< steal subject end");
    }
}
