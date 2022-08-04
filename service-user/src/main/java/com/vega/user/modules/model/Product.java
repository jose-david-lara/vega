package com.vega.user.modules.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {

    private String name;
    private String value;

}
