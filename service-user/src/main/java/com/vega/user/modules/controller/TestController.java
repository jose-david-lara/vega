package com.vega.user.modules.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.vega.user.modules.service.UserService;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vega.user.modules.model.TestInput;
import com.vega.user.spring.ErrorMessage;

@RestController
@EnableHystrix
@RequestMapping(value = "/users")
public class TestController extends UserService {

    @PostMapping(value = "/testUser")
    public ResponseEntity<String> testUser(@Valid @RequestBody TestInput testInput, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("Entre en error");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, this.formatMessage(result));
        }

        return new ResponseEntity<String>("Prueba", HttpStatus.OK);
    }


    @HystrixCommand
    @GetMapping(value = "/getProduct")
    public ResponseEntity<String> getProductController (){

        return new ResponseEntity<String>(this.getProduct(), HttpStatus.OK);
    }



    private String formatMessage(BindingResult result) {
        List<Map<String,String>> errors = result.getFieldErrors().stream()
                .map(err ->{
                    Map<String,String>  error =  new HashMap<>();
                    error.put(err.getField(), err.getDefaultMessage());
                    return error;

                }).collect(Collectors.toList());
        ErrorMessage errorMessage = ErrorMessage.builder()
                .code("01")
                .message(errors).build();
        ObjectMapper mapper = new ObjectMapper();
        String jsonString="";
        try {
            jsonString = mapper.writeValueAsString(errorMessage);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("JSON STRING:::::::"+jsonString);
        return jsonString;

    }

}
