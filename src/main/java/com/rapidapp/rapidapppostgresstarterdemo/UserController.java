package com.rapidapp.rapidapppostgresstarterdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    private final PodamFactory podamFactory;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.podamFactory  = new PodamFactoryImpl();
    }

    @GetMapping("/create")
    public User createUser() {
        User user = podamFactory.manufacturePojo(User.class);
        return userRepository.save(user);
    }

    @GetMapping
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/delete")
    public void deleteUsers() {
        userRepository.deleteAll();
    }
}
