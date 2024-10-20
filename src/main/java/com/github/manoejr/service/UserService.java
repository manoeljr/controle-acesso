package com.github.manoejr.service;

import com.github.manoejr.model.User;
import com.github.manoejr.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void gravar(User user) {
        repository.save(user);
    }

    public void alterando(User user) {
        repository.save(user);
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public List<User> listar() {
        return repository.findAll();
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }
}
