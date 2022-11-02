package com.example.Practice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepositor extends CrudRepository<CrudEntity, Long> {
}
