package com.vega.user.modules.client;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;

@FeignClient(name = "service-product", fallback = ProductHystrixFallbackFactory.class)
//@RequestMapping("/product")
public interface ProductClient {


     @GetMapping(value = "/product/getProduct")
    public ResponseEntity<String> getProduct();


}
