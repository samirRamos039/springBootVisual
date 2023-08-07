package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.usuario;

@RestController
public class usuarioControler {
    
    @RequestMapping(value = "usuario/{id}")
    public usuario create(@PathVariable int id){
        usuario usuario = new usuario();
        usuario.setId(3);
        usuario.setCorreo("samir@gmail");
        usuario.setDireccion("calle 55");
        usuario.setNombre("samir");

        return usuario;
    }
     @RequestMapping(value = "update")
     public usuario update(){
        usuario usuario = new usuario();
        usuario.setId(3);
        usuario.setCorreo("samir@gmail");
        usuario.setDireccion("calle 55");
        usuario.setNombre("samir");

        return usuario;
    }
     @RequestMapping(value = "read")  
     public usuario read(){
        usuario usuario = new usuario();
        usuario.setId(3);
        usuario.setCorreo("samir@gmail");
        usuario.setDireccion("calle 55");
        usuario.setNombre("samir");

        return usuario;
    }
     @RequestMapping(value = "delete")
     public usuario delete(){
        usuario usuario = new usuario();
        usuario.setId(3);
        usuario.setCorreo("samir@gmail");
        usuario.setDireccion("calle 55");
        usuario.setNombre("samir");

        return usuario;
    }
}
//comentario