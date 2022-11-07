package com.example.digitopia.business.abstracts;

import com.example.digitopia.business.requests.invitations.CreateInvitationRequest;
import com.example.digitopia.business.requests.invitations.DeleteInvitationRequest;
import com.example.digitopia.business.requests.invitations.UpdateInvitationRequest;
import com.example.digitopia.business.requests.users.CreateUserRequest;
import com.example.digitopia.business.requests.users.DeleteUserRequest;
import com.example.digitopia.business.requests.users.UpdateUserRequest;
import com.example.digitopia.business.responses.GetAllInvitationResponse;
import com.example.digitopia.business.responses.GetAllUsersResponse;

import java.util.List;

public interface InvitationService extends BaseService{

    List<GetAllInvitationResponse> getAll();
    void add(CreateInvitationRequest createInvitationRequest);
    void delete(DeleteInvitationRequest deleteInvitationRequest);
    void update(UpdateInvitationRequest updateInvitationRequest);
}
