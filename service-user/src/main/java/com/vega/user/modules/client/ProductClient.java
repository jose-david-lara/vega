package com.vega.user.modules.client;


import com.vega.user.modules.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@FeignClient(name = "service-product", path = "/product")
//@RequestMapping("/product")
public interface ProductClient {

    @GetMapping(value = "/getProduct")
    public ResponseEntity<String> getProduct();

}
