package com.monocept.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.monocept.model.Address;

@Repository
@Component
public interface AddressRepository extends CrudRepository<Address, Integer> {

}
