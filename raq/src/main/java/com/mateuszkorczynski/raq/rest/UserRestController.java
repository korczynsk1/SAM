package com.mateuszkorczynski.raq.rest;

import com.mateuszkorczynski.raq.model.User;
import com.mateuszkorczynski.raq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by MAKORCZY on 2017-10-17.
 */
@Controller
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<User> readUsers() {
        return userService.findAll();
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public User readUserById(@PathVariable String userId) {
        return userService.getById(userId);
    }
}
