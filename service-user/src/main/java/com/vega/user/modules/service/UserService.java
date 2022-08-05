package com.vega.user.modules.service;

import com.vega.user.modules.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    ProductClient productClient;

    public String getProduct(){


        String respuestaProducto = productClient.getProduct().getBody();

                System.out.println("::::::RESPUESTA PRODUCTO::::::"+respuestaProducto);

        return respuestaProducto;
    }

}
