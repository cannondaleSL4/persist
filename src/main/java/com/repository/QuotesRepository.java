package com.repository;

import com.dim.fxapp.entity.impl.Quotes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuotesRepository extends CrudRepository<Quotes, Integer> {
    @Override
    <S extends Quotes> List<S> saveAll(Iterable<S> var1);
}
