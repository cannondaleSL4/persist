package com.repository;

import com.dim.fxapp.entity.impl.Quotes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "quotes", path = "quotes")
public interface MongoQuotesRepository extends MongoRepository<Quotes,Integer> {
    List<Quotes> findByCurrency(@Param("currencyname") String currency);

    List<Quotes> findByCurrencyAndPeriod(@Param("currencyname") String currency,
                                         @Param("period")String period);

    List<Quotes> findByCurrencyAndPeriodAndData(@Param("currencyname") String currency,
                                                @Param("period")String period,
                                                @Param("data") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") LocalDateTime data);
}


//http://localhost:9097/quotes/search/findByCurrencyAndPeriod?currencyname=EURUSD&period=15

//http://localhost:9097/quotes/search/findByCurrencyAndPeriodAndData?currencyname=EURUSD&period=15&data=2018-05-27%2022:15
// %20 - it's space for httprequest