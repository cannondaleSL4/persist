package com.repository;

import com.dim.fxapp.entity.impl.Quotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactory;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;


@NoRepositoryBean
public class QuotesSimpleMongoRepository extends SimpleMongoRepository<Quotes, Integer>{

    private final MongoOperations mongoOperations;


    public QuotesSimpleMongoRepository(final MongoEntityInformation<Quotes, Integer> metadata, final MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
        this.mongoOperations = mongoOperations;
    }

    @Autowired
    public QuotesSimpleMongoRepository(MongoRepositoryFactory factory, MongoOperations mongoOperation) {
        this(factory.<Quotes, Integer>getEntityInformation(Quotes.class), mongoOperation);
    }


    @Override
    public <T extends Quotes> T save(T entity) {
        Query query = new Query();
        query.addCriteria(Criteria.where("currency").is(entity.getCurrency()).and("period").is(entity.getPeriod()).and("data").is(entity.getData()));
        Optional<Quotes> optionalQuotes = Optional.ofNullable(mongoOperations.findOne(query, Quotes.class));

        return optionalQuotes.isPresent() ?
                (T) mongoOperations.findOne(query,Quotes.class) : super.save(entity);
    }

}
