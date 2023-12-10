package com.firstspringflow.FirstSpringFlow.resources;

import com.firstspringflow.FirstSpringFlow.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    // o GetMapping é um anotation pra indicar que o método responde a requisicao do tipo get do HTTP
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria", "maria@gmail.com", "99999999", "12345");
        // o ok é pra retornar a reposta com sucesso no HTTP
        // o .body é pra retornar o corpo desse usuário u passado como argumento
        return ResponseEntity.ok().body(u);
    }

}
