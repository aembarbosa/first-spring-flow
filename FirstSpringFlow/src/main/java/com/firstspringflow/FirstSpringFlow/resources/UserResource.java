package com.firstspringflow.FirstSpringFlow.resources;

import com.firstspringflow.FirstSpringFlow.entities.User;
import com.firstspringflow.FirstSpringFlow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    // Retorna lista de usuarios
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        // o ok é pra retornar a reposta com sucesso no HTTP
        // o .body é pra retornar o corpo desse usuário u passado como argumento
        return ResponseEntity.ok().body(list);
    }

    // Retorna um usuario especifico
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> finById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    // Inserir novo recurso no banco de dados - usar metodo POST
    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj) {
        obj = service.insert(obj);
        // ServletUriComponentsBuilder - classe que fornece metodos para construir URIs
        // fromCurrentRequest() - metodo usado para criar uma instância de UriComponentsBuilder
        // path("/{id}) - metodo utilizado para adicionar um segmento de caminho à URI sendo construída
        // buildAndExpand(obj.getId()) - metodo espera o id que eu inseri
        // toUri() - converte o obj para tipo URI
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    // @PathVariable para o Long id ser reconhecido como uma variavel da url
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        // O noContent retorna uma resposta vazia; o codigo HTTP de uma resposta que nao tem conteudo eh o 204
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
