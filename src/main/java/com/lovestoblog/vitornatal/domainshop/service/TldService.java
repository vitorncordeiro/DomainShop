package com.lovestoblog.vitornatal.domainshop.service;

import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TldService {
    private static final String IANA_TLD_URL = "https://data.iana.org/TLD/tlds-alpha-by-domain.txt";
    public Set<String> getTlds(){
       try {
           HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest.newBuilder()
                   .uri(URI.create(IANA_TLD_URL))
                   .GET()
                   .build();
           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
           Set<String> tlds = response.body().lines()
                   .filter(line -> !line.startsWith("#") && !line.isBlank())
                   .map(String::toUpperCase)
                   .collect(Collectors.toSet());
           return tlds;
       } catch (Exception e){
           throw new RuntimeException("Error: " + e.getMessage());
       }
    }
    public boolean isValidTld(String domain) {
        String tld = domain.substring(domain.lastIndexOf('.') + 1).toUpperCase();
        return getTlds().contains(tld);
    }
}
