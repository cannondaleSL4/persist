package com.repository;

import com.dim.fxapp.entity.impl.Quotes;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by dima on 21.05.18.
 */
@RepositoryRestResource(collectionResourceRel = "quotes", path = "quotes")
public interface MongoQuotesRepository extends PagingAndSortingRepository<Quotes,Integer> {
    List<Quotes> findByCurrency(@Param("name") String currency);
}
