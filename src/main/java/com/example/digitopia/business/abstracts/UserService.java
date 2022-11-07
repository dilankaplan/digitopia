package com.example.digitopia.business.abstracts;

import com.example.digitopia.business.requests.users.CreateUserRequest;
import com.example.digitopia.business.requests.users.DeleteUserRequest;
import com.example.digitopia.business.requests.users.UpdateUserRequest;
import com.example.digitopia.business.responses.GetAllUsersResponse;

import java.util.List;

public interface UserService extends BaseService{
    List<GetAllUsersResponse> getAll();
    void add(CreateUserRequest createUserRequest);
    void delete(DeleteUserRequest deleteUserRequest);
    void update(UpdateUserRequest updateUserRequest);
}
