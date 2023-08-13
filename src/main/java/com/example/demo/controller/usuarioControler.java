package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "lista de usuario")
    public List <usuario> create(){
        List <usuario> usuarios = new ArrayList<usuario>();
        usuario usuario = new usuario();
        usuario.setId(1);
        usuario.setCorreo("samir@gmail");
        usuario.setDireccion("calle 55");
        usuario.setNombre("samir");

        usuario usuario1 = new usuario();
        usuario1.setId(2);
        usuario1.setCorreo("samir@gmail");
        usuario1.setDireccion("calle 55");
        usuario1.setNombre("carlos");

        usuario usuario2 = new usuario();
        usuario2.setId(3);
        usuario2.setCorreo("samir@gmail");
        usuario2.setDireccion("calle 55");
        usuario2.setNombre("Ana maria");

        usuarios.add(usuario);
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        return usuarios;
    }

     @RequestMapping(value = "update")
     public usuario update(){
        usuario usuario = new usuario();
        usuario.setId(4);
        usuario.setCorreo("samir@gmail");
        usuario.setDireccion("calle 55");
        usuario.setNombre("samir");

        return usuario;
    }
     @RequestMapping(value = "read")  
     public usuario read(){
        usuario usuario = new usuario();
        usuario.setId(6);
        usuario.setCorreo("samir@gmail");
        usuario.setDireccion("calle 55");
        usuario.setNombre("samir");
//carlo
        return usuario;
    }
     @RequestMapping(value = "delete")
     public usuario delete(){
        usuario usuario = new usuario();
        usuario.setId(21);
        usuario.setCorreo("samir@gmail");
        usuario.setDireccion("calle 55");
        usuario.setNombre("samir");

        return usuario;
    }
}
//comentario kkk