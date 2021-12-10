package com.monocept.repository;

import org.springframework.data.repository.CrudRepository;

import com.monocept.model.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
