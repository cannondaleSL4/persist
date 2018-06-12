package com.repository;

import com.dim.fxapp.entity.impl.Quotes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "/quotes", path = "/quotes")
public interface MongoQuotesRepository extends MongoRepository<Quotes,Integer> {

    @ApiOperation(
            value ="Insert new record in quotes database",
            produces = "application/json",
            responseContainer = "List",
            response = Quotes.class
    )
    <S extends Quotes> S insert(S entities);

    @ApiOperation(
            value ="Bulk insert in quotes database",
            produces = "application/json",
            responseContainer = "List",
            response = Quotes.class
    )
    @Override
    <S extends Quotes> List<S> insert(Iterable<S> entities);

    @Override
    @ApiOperation(
            value ="Insert new record in quotes database",
            produces = "application/json",
            responseContainer = "List",
            response = Quotes.class
    )
    <S extends Quotes> List<S> saveAll(Iterable<S> entities);

    @ApiOperation("find all quotes by currency name")
    List<Quotes> findByCurrency(@Param("currencyname") String currency);

    @ApiOperation("find all quotes by currency name/period value")
    List<Quotes> findByCurrencyAndPeriod(@Param("currencyname") String currency,
                                         @Param("period")String period);

    @ApiOperation("find all quotes by currency name/period value/data")
    List<Quotes> findByCurrencyAndPeriodAndData(@Param("currencyname") String currency,
                                                @Param("period")String period,
                                                @Param("data") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") LocalDateTime data);

    @ApiOperation("find all quotes by currency name/period value/data/period between")
    List<Quotes> findByCurrencyAndPeriodAndDataBetween (@Param("currencyname") String currency,
                                                        @Param("period")String period,
                                                        @Param("from") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") LocalDateTime from,
                                                        @Param("to") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") LocalDateTime to);
}


//http://localhost:9097/quotes/search/findByCurrencyAndPeriod?currencyname=EURUSD&period=15

//http://localhost:9097/quotes/search/findByCurrencyAndPeriodAndData?currencyname=EURUSD&period=15&data=2018-05-27%2022:15
// %20 - it's space for http request

// http://localhost:9097/quotes/search/findByCurrencyAndPeriodAndDataBetween?currencyname=EURUSD&period=15&from=2018-05-27%2000:00&to=2018-05-28%2000:00