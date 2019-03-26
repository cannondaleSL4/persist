package com;

import com.repository.QuotesSimpleMongoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by dima on 07.05.18.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories(repositoryBaseClass = QuotesSimpleMongoRepository.class)
public class PersistApplications {
    public static void main(String[] args) {
        SpringApplication.run(PersistApplications.class, args) ;
    }
}

