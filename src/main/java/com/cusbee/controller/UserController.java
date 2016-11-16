package com.cusbee.controller;

import com.cusbee.entity.User;
import com.cusbee.entity.request.AddUserRequest;
import com.cusbee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Endriu on 16.11.2016.
 */
@RestController
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public  UserController (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(AddUserRequest addUserRequest){
        User user = new User();
        user.setName(addUserRequest.getName());
        user.setSurname(addUserRequest.getSurname());
        userRepository.save(user);

    }
}
