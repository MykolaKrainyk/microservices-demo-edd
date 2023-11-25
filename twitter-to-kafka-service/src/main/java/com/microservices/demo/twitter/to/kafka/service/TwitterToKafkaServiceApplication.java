package com.microservices.demo.twitter.to.kafka.service;


import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfigData configData) {
        this.twitterToKafkaServiceConfigData = configData;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("App starts...");
        log.info(Arrays.toString(twitterToKafkaServiceConfigData
                .getTwitterKeywords().toArray(new String[] {})));
        log.info(twitterToKafkaServiceConfigData.getWelcomeMessage());
    }
}
