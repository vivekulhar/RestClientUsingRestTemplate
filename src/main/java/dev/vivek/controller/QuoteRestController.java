package dev.vivek.controller;

import dev.vivek.bindings.Quote;
import dev.vivek.service.QuoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteRestController {
    @Autowired
    private QuoteClient quoteClient;
    @GetMapping("/quote")
    public ResponseEntity<Quote> getQuote(){
        return quoteClient.invokeRandomQuoteApi();
    }
}
