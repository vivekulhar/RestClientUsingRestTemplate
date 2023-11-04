package dev.vivek.service;

import dev.vivek.bindings.Quote;
import dev.vivek.props.AppProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class QuoteClient {
    private AppProperties appProperties;
    public QuoteClient(AppProperties appProperties) {
        this.appProperties = appProperties;
    }
    public ResponseEntity<Quote> invokeRandomQuoteApi() {
        //String apiUrl = "https://api.quotable.io/random";
        Map<String,String> messages = appProperties.getMessages();
        String apiUrl = messages.get("quoteApiUrl");
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
