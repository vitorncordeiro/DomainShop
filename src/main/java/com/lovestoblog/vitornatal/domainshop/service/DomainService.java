package com.lovestoblog.vitornatal.domainshop.service;

import client.RDAPClient;
import client.response.DomainSearchResponse;
import client.response.DomainStatusResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DomainService {

    private final RDAPClient client;

    public DomainService(RDAPClient client){
        this.client = client;
    }

    public DomainSearchResponse search(String query){
        return  client.search(query);
    }
}
