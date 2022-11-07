package com.example.digitopia.webApi.controller;

import com.example.digitopia.business.abstracts.UserService;
import com.example.digitopia.business.requests.users.CreateUserRequest;
import com.example.digitopia.business.requests.users.DeleteUserRequest;
import com.example.digitopia.business.requests.users.UpdateUserRequest;
import com.example.digitopia.business.responses.GetAllUsersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/getall")
    public List<GetAllUsersResponse> getAll(){

        return userService.getAll();
    }
    @PostMapping("/add")

    public void add(@RequestBody CreateUserRequest createUserRequest){
         this.userService.add(createUserRequest);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteUserRequest deleteUserRequest){
        this.userService.delete(deleteUserRequest);
    }
    @PutMapping("/update")
    public void update(@RequestBody UpdateUserRequest updateUserRequest){
        this.userService.update(updateUserRequest);
    }

}
