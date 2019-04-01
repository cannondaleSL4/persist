package com.controller;

import com.dim.fxapp.entity.impl.Quotes;
import com.mongodb.MongoWriteException;
import com.repository.MongoQuotesRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RepositoryRestController
@RequestMapping(value = "/quotes")
public class QuotesController {
    @Autowired
    MongoQuotesRepository mongoQuotesRepository;

    @Autowired
    MongoOperations mongoOperations;

    private final org.slf4j.Logger Log = LoggerFactory.getLogger(QuotesController.class);

    @RequestMapping(value = "/savelist",
            consumes = APPLICATION_JSON_VALUE,
            method = RequestMethod.POST,
            produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void saveList(@RequestBody List<Quotes> listOfQuotes) {
        List<Quotes> onlyNewQuotesList = listOfQuotes.stream()
                .filter(this::isNew)
                .collect(Collectors.toList());
        try {
            if (!onlyNewQuotesList.isEmpty()){
                mongoQuotesRepository.saveAll(onlyNewQuotesList);
            } else {
                Log.info("list has no new quotes or is empty at all");
            }
            } catch (MongoWriteException e) {
            Log.error(e.getMessage());
        }
    }

    private Boolean isNew (Quotes entity){
        Query query = new Query();
        query.addCriteria(Criteria.where("currency").is(entity.getCurrency()).and("period").is(entity.getPeriod()).and("data").is(entity.getData()));
        Optional<Quotes> optionalQuotes = Optional.ofNullable(mongoOperations.findOne(query, Quotes.class));
        return !optionalQuotes.isPresent();
    }
}