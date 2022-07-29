package com.vega.usuarios.modulos.sesion.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    

        @PostMapping(value = "/auth")
        public ResponseEntity<String> authUser (){


            return new ResponseEntity<String>("OKAY", HttpStatus.OK);
        }

}
