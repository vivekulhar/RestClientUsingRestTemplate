package dev.vivek.controller;

import dev.vivek.service.QuoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteRestController {
    @Autowired
    private QuoteClient quoteClient;
    @GetMapping("/quote")
    public String getQuote(){
        return quoteClient.invokeRandomQuoteApi();
    }
}
