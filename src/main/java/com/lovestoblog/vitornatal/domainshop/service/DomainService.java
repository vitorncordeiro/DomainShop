package com.lovestoblog.vitornatal.domainshop.service;

import com.lovestoblog.vitornatal.domainshop.client.RDAPClient;
import com.lovestoblog.vitornatal.domainshop.client.response.DomainSearchResponse;
import com.lovestoblog.vitornatal.domainshop.exception.InvalidTldException;
import org.springframework.stereotype.Service;

@Service
public class DomainService {

    private final RDAPClient rdapClient;
    private final TldService tldService;

    public DomainService(RDAPClient rdapClient, TldService tldService){
        this.rdapClient = rdapClient;
        this.tldService = tldService;
    }

    public DomainSearchResponse search(String query) {
        if(!tldService.isValidTld(query)){
            throw new InvalidTldException("TLD not valid");
        }

        try{
            return rdapClient.search(query);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


    }
}
