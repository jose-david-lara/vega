package com.vega.user.modules.model;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class TestInput {

    @NotNull(message = "El campo no puede estar nulo")
    @NotEmpty(message = "El campo no puede estar vacio")
    private String name;

    @NotNull(message = "El campo no puede estar nulo")
    @NotEmpty(message = "El campo no puede estar vacio")
    private String last_name;

    
}
