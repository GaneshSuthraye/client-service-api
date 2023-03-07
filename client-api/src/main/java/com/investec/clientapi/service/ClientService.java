package com.investec.clientapi.service;

import com.investec.clientapi.model.Client;
import com.investec.clientapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client getClient(String mobileNumber){
        return clientRepository.findByMobileNumber(mobileNumber);
    }

    public Client createClient(Client client){
       return clientRepository.save(client);
    }

    public Client updateClient(Client client){
        return clientRepository.save(client);
    }

}
