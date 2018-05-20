package com.repository;

import com.dim.fxapp.entity.Quotes;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by dima on 20.05.18.
 */
@NoRepositoryBean
public interface Repository<EntityType extends Quotes> extends PagingAndSortingRepository<EntityType, Integer> {
}
