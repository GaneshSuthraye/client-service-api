package com.investec.clientapi.controller;

import com.investec.clientapi.model.Client;
import com.investec.clientapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/clientapi")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/client/{mobileNumber}")
    public ResponseEntity getClient(@PathParam("mobileNumber") String mobileNumber){
        return new ResponseEntity(clientService.getClient(mobileNumber), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity createClient(@RequestBody Client client){
        return new ResponseEntity(clientService.createClient(client), HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity updateClient(@RequestBody Client client){
        return new ResponseEntity(clientService.updateClient(client), HttpStatus.OK);
    }



}
