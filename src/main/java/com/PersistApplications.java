package com;

import com.repository.MongoQuotesRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

/**
 * Created by dima on 07.05.18.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PersistApplications {
    public static void main(String[] args) {
        SpringApplication.run(PersistApplications.class, args) ;
    }
}

