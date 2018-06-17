package com.controller;

import com.dim.fxapp.entity.impl.Quotes;
import com.mongodb.MongoWriteException;
import com.repository.MongoQuotesRepository;
import com.repository.QuotesRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RepositoryRestController
@RequestMapping(value = "/quotes")
public class QuotesController {
    @Autowired
    MongoQuotesRepository mongoQuotesRepository;

    @Autowired
    QuotesRepository quotesRepository;

    private final org.slf4j.Logger Log = LoggerFactory.getLogger(QuotesController.class);

    @RequestMapping(value = "/savelist",
            consumes = APPLICATION_JSON_VALUE,
            method = RequestMethod.POST,
            produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void saveList(@RequestBody List<Quotes> listOfquotes) {
        try {
            listOfquotes.forEach(quote -> mongoQuotesRepository.save(quote));
        } catch (MongoWriteException e) {
            Log.error(e.getMessage());
        }

    }
}
