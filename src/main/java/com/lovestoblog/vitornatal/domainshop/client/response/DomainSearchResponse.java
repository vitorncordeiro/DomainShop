package com.lovestoblog.vitornatal.domainshop.client.response;

import java.util.List;
import java.util.Map;

public record DomainSearchResponse (String ldhName, List<Map<String, String>> events){
}
