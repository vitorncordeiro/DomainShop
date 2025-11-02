package com.lovestoblog.vitornatal.domainshop.controller;

import com.lovestoblog.vitornatal.domainshop.client.response.DomainSearchResponse;
import com.lovestoblog.vitornatal.domainshop.dto.DomainQueryDTO;
import com.lovestoblog.vitornatal.domainshop.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domains")
public class DomainController {

    @Autowired
    DomainService domainService;

    @GetMapping("/search")
    public ResponseEntity<DomainSearchResponse> search(@RequestBody DomainQueryDTO domainRequestDTO) {
        return ResponseEntity.ok(domainService.search(domainRequestDTO.domain()));
    }

}
