package com.repository;

import com.dim.fxapp.entity.impl.quotes.AUDUSD;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by dima on 21.05.18.
 */
@RepositoryRestResource(collectionResourceRel = "quotes", path = "quotes")
public interface QuotesRepository extends Repository<AUDUSD>,PagingAndSortingRepository<AUDUSD, Integer> {
}
