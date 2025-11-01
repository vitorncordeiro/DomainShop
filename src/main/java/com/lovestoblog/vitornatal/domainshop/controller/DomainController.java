package com.lovestoblog.vitornatal.domainshop.controller;

import client.response.DomainSearchResponse;
import com.lovestoblog.vitornatal.domainshop.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domains")
public class DomainController {

    @Autowired
    DomainService domainService;

    @GetMapping
    public DomainSearchResponse search(String query){
        return domainService. ;
    }
    @GetMapping
    public String status(String domain){
        return "";
    }
}
