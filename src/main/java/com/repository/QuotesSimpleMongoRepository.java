package com.repository;

import com.dim.fxapp.entity.impl.Quotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactory;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public class QuotesSimpleMongoRepository extends SimpleMongoRepository<Quotes, Integer>{

//    @Autowired
//    private static MongoTemplate mongoTemplate;


    public QuotesSimpleMongoRepository(final MongoEntityInformation<Quotes, Integer> metadata, final MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
    }

    @Autowired
    public QuotesSimpleMongoRepository(MongoRepositoryFactory factory, MongoOperations mongoOperations) {
        this(factory.<Quotes, Integer>getEntityInformation(Quotes.class), mongoOperations);
    }


    @Override
    public <T extends Quotes> T save(T entity) {
        System.out.println("eeeeee");
        return super.save(entity);
    }

}
