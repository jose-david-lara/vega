package com.vega.user.modules.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductHystrixFallbackFactory implements ProductClient{
    @Override
    public ResponseEntity<String> getProduct() {

        return new ResponseEntity<String>("this.getProduct()888", HttpStatus.OK);
    }

    private ResponseEntity<String> fallback_hello() {
        return new ResponseEntity<String>("this.getProduct()", HttpStatus.OK);
    }
}
