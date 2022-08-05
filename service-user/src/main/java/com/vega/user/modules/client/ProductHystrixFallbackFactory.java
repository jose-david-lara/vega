package com.vega.user.modules.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductHystrixFallbackFactory implements ProductClient{
    @Override
    public ResponseEntity<String> getProduct() {

        return ResponseEntity.ok("Fallo el servicio pero funciono el ProductHystrixFallbackFactory :)");
    }
}
