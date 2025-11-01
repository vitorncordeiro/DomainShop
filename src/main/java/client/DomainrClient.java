package client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import client.response.DomainSearchResponse;
import client.response.DomainStatusResponse;


@FeignClient(name="domainr", url= "${domain.client.domainr}")
public interface DomainrClient {
    @GetMapping("/search")
    DomainSearchResponse search(
            @RequestParam("client_id") String client_id,
            @RequestParam("query") String query
    );
    @GetMapping("/status")
    DomainStatusResponse status(
            @RequestParam("client_id") String client_id,
            @RequestParam("domain") String domain
    );
}
