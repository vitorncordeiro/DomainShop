package client.response;

public record DomainStatusResponse (String domain, String zone, String status, String summary){
}
