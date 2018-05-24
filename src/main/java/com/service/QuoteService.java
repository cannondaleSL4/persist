package com.service;

import com.repository.MongoQuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dima on 07.05.18.
 */
@Service
public class QuoteService {
    @Autowired
    MongoQuotesRepository repository;
}
