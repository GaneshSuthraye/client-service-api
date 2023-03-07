package com.investec.clientapi.repository;

import com.investec.clientapi.entities.Customer;
import com.investec.clientapi.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Customer, Integer> {

    Client findByMobileNumber(String mobileNumber);

}
