package com.github.manoejr.controller;


import com.github.manoejr.model.User;
import com.github.manoejr.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> list() {
        return service.listar();
    }

    @PostMapping
    public void save(User user) {
        service.gravar(user);
    }

    @PutMapping
    public void update(User user) {
        service.alterando(user);
    }

    @GetMapping("/{username}")
    public User findByUsername(@PathVariable String username) {
        return service.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deletar(id);
    }
}
