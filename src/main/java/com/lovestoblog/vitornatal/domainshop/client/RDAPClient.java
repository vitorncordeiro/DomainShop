package com.lovestoblog.vitornatal.domainshop.client;

import com.lovestoblog.vitornatal.domainshop.client.response.DomainSearchResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="rdap", url= "${domain.client.rdap}")
public interface RDAPClient {
    @GetMapping("/domain/{domain}")
    DomainSearchResponse search(
            @PathVariable("domain") String domain
    );

}
