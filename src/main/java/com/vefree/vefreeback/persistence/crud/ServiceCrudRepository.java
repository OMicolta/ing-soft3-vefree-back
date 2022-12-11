package com.vefree.vefreeback.persistence.crud;

import com.vefree.vefreeback.persistence.entity.Service;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceCrudRepository extends CrudRepository<Service, Integer> {
    @Query("select s from Service s where s.providerId = :userId or s.beneficiaryId = :userId")
    public List<Service> findByUserId(String userId);
}
