package com.github.manoejr;

import com.github.manoejr.model.User;
import com.github.manoejr.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApplication implements CommandLineRunner {

    private final UserRepository repository;

    public StartApplication(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Manoel");
        user.setUsername("manoel");
        user.setPassword("123456");
        user.setRoles(null);
        repository.save(user);

        for (User u: repository.findAll()) {
            System.out.println(u);
        }
    }

}
