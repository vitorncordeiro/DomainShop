package client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import client.response.DomainSearchResponse;
import client.response.DomainStatusResponse;


@FeignClient(name="rdap", url= "${domain.client.rdap}")
public interface RDAPClient {
    @GetMapping("/search")
    DomainSearchResponse search(
            @RequestParam("query") String query
    );
    @GetMapping("/status")
    DomainStatusResponse status(
            @RequestParam("client_id") String client_id
    );
}
