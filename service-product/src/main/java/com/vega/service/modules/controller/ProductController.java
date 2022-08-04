package com.vega.service.modules.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/product")
public class ProductController {


    @GetMapping(value = "/getProduct")
    public ResponseEntity<String> getProduct() {

        return new ResponseEntity<String>("producto", HttpStatus.OK);
    }
}
