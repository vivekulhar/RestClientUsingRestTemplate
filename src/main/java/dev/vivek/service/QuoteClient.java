package dev.vivek.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteClient {

    public String invokeRandomQuoteApi() {
        String apiUrl = "https://fakestoreapi.com/products";
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> responseEntity = rt.getForEntity(apiUrl, String.class);
        int statusCode = responseEntity.getStatusCodeValue();
        if(statusCode == 200){
            return responseEntity.getBody();
        }
        return null;
    }
}
