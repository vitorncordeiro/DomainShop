package com.lovestoblog.vitornatal.domainshop.service;

import client.DomainrClient;
import client.response.DomainSearchResponse;
import client.response.DomainStatusResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DomainService {

    private final DomainrClient client;

    @Value("${domainr.clientId}")
    private String clientId;

    public DomainService(DomainrClient client){
        this.client = client;
    }

    public DomainSearchResponse search(String query){
        return  client.search(clientId, query);
    }

    public DomainStatusResponse status(String domain){
        return client.status(clientId, domain);
    }
}
