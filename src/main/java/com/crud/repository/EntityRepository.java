package com.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.domain.Entidy;

public interface EntityRepository extends CrudRepository<Entidy, Long> {

}
