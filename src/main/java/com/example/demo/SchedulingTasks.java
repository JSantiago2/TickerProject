package com.example.demo;


import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulingTasks {

    private static final Logger log = LoggerFactory.getLogger(SchedulingTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 35000)
    public void reportCurrentTime(){

        RestTemplate restTemplate = new RestTemplate();
        Container container = restTemplate.getForObject(
                "https://api.cryptonator.com/api/full/btc-usd", Container.class);
        log.info(container.toString());

        log.info("The time is now {}", dateFormat.format(new Date()));
    }





}
