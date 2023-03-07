package com.investec.clientapi.service;

import com.investec.clientapi.entities.Customer;
import com.investec.clientapi.model.Client;
import com.investec.clientapi.repository.ClientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client getClient(String mobileNumber){
        return clientRepository.findByMobileNumber(mobileNumber);
    }

    public Customer createClient(Client client){
        Customer customer = new Customer();
        BeanUtils.copyProperties(client,customer);
        return clientRepository.save(customer);
    }

    public Customer updateClient(Client client){
        Customer customer = new Customer();
        BeanUtils.copyProperties(client,customer);
        return clientRepository.save(customer);
    }

}
