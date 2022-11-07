package com.example.digitopia.business.concretes;

import com.example.digitopia.business.abstracts.UserService;
import com.example.digitopia.business.requests.users.CreateUserRequest;
import com.example.digitopia.business.requests.users.DeleteUserRequest;
import com.example.digitopia.business.requests.users.UpdateUserRequest;
import com.example.digitopia.business.responses.GetAllUsersResponse;
import com.example.digitopia.dataAccess.abstracts.UserRepository;
import com.example.digitopia.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserManager implements UserService {

    private UserRepository userRepository ;
    @Autowired
    public UserManager(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public List<GetAllUsersResponse> getAll() {
        List<User> users = userRepository.findAll();
        List<GetAllUsersResponse> usersResponses =
                new ArrayList<GetAllUsersResponse>();
        for(User user:users){
            GetAllUsersResponse responseItem = new GetAllUsersResponse();
            responseItem.setId(user.getId());
            responseItem.setFullName(user.getFullName());
            responseItem.setEmail(user.getEmail());

            usersResponses.add(responseItem);
        }
        return usersResponses;
    }

    @Override
    public void add(CreateUserRequest createUserRequest) throws Exception {
        User user = new User();
        user.setStatus(createUserRequest.getStatus());
        user.setFullName(createUserRequest.getFullName());
        if(this.userRepository.existsByEmail(createUserRequest.getEmail())) {
            throw new Exception("This email adress has already exist");
        }
        else {
            user.setEmail(createUserRequest.getEmail());
        }
        user.setNormalizedName(createUserRequest.getNormalizedName());
        this.userRepository.save(user);
    }

    @Override
    public void delete(DeleteUserRequest deleteUserRequest) {
        User user = new User();
        user.setFullName(deleteUserRequest.getFullName());
        user.setEmail(deleteUserRequest.getEmail());

    }
    @Override
    public void update(UpdateUserRequest updateUserRequest) {
        User user = new User();
        user.setFullName(updateUserRequest.getFullName());
        user.setEmail(updateUserRequest.getEmail());
    }



}
