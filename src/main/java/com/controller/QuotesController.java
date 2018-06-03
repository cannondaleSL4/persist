package com.controller;

import com.repository.MongoQuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dima on 02.06.18.
 */
@RestController
@RequestMapping(value = "/quotes")
public class QuotesController {
    @Autowired
    MongoQuotesRepository repository;
}
