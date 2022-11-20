package com.vefree.vefreeback.persistence.crud;

import com.vefree.vefreeback.persistence.entity.Service;
import com.vefree.vefreeback.persistence.entity.VehicleType;
import org.springframework.data.repository.CrudRepository;

public interface VehicleTypeCrudRepository extends CrudRepository<VehicleType, Integer> {

}
