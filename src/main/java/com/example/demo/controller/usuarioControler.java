package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.usuario;

@RestController
public class usuarioControler {
    
    @RequestMapping(value = "usuario")
    public usuario getUsuario(){
        usuario usuario = new usuario();
        usuario.setId(3);
        usuario.setCorreo("samir@gmail");
        usuario.setDireccion("calle 55");
        usuario.setNombre("samir");

        return usuario;
    }
}
