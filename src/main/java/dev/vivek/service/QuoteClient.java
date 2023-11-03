package dev.vivek.service;

import dev.vivek.bindings.Quote;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteClient {

    public ResponseEntity<Quote> invokeRandomQuoteApi() {
        String apiUrl = "https://api.quotable.io/random";
        RestTemplate rt = new RestTemplate();
        ResponseEntity<Quote> responseEntity = rt.getForEntity(apiUrl, Quote.class);
        int statusCode = responseEntity.getStatusCodeValue();
        if(statusCode == 200){
            Quote quote = responseEntity.getBody();
            quote.setContent(quote.getContent().toUpperCase());
            return responseEntity;
        }
        return null;
    }
}
