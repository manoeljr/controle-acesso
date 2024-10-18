package com.github.manoejr;

import com.github.manoejr.model.User;
import com.github.manoejr.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApplication implements CommandLineRunner {

    private UserService userService;

    public StartApplication(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int x = 1; x <= 5; x++) {
            userService.gravar(new User("user " + x));
        }
        User user2 = userService.buscarPorUsername("user 2");
        user2.setName("Master");
        userService.alterando(user2);

        for (User user: userService.listar()) {
            System.out.println(user);
        }
    }
}
