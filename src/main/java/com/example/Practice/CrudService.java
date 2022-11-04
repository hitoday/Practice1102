package com.example.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CrudService {
    private final CrudRepository crudRepo;

    @Autowired
    protected CrudService(CrudRepository crudRepo){
        this.crudRepo = crudRepo;
    }

    public void insertReview(CrudEntity crudEntity){
        crudEntity.setCreatedDate(LocalDateTime.now());
        crudRepo.save(crudEntity);
    }
}
