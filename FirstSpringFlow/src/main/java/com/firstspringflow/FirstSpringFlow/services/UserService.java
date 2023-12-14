package com.firstspringflow.FirstSpringFlow.services;

import com.firstspringflow.FirstSpringFlow.entities.User;
import com.firstspringflow.FirstSpringFlow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
       Optional<User> obj = repository.findById(id);
       return obj.get();
    }

    // Inserir um usuario no banco de dados
    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
