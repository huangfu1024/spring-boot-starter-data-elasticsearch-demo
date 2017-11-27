package com.nero.elasticsearch;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImplTest extends SpringBootStarterDataElasticsearchDemoApplicationTests{

    @Autowired
    private UserRepositoryImpl userRepository;

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testFindOne(){

        Long id = 5L;
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(user1 -> System.out.println(user1.getName()));
    }

    @Test
    public void testFindAll(){

        Iterable<User> users = userRepository.findAll();
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    @Test
    public void testFindByName(){

        Iterable<User> users = userRepository.findByName("宋江");
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    @Test
    public void testFindByDesc(){

        Iterable<User> users = userService.findByDesc("宋江");
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

}