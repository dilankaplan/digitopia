package com.example.digitopia.webApi.controller;

import com.example.digitopia.business.abstracts.InvitationService;
import com.example.digitopia.business.abstracts.UserService;
import com.example.digitopia.business.requests.invitations.CreateInvitationRequest;
import com.example.digitopia.business.requests.invitations.DeleteInvitationRequest;
import com.example.digitopia.business.requests.invitations.UpdateInvitationRequest;
import com.example.digitopia.business.requests.users.CreateUserRequest;
import com.example.digitopia.business.requests.users.DeleteUserRequest;
import com.example.digitopia.business.requests.users.UpdateUserRequest;
import com.example.digitopia.business.responses.GetAllInvitationResponse;
import com.example.digitopia.business.responses.GetAllUsersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/invitations")
    public class InvitationsController {
        private InvitationService invitationService;

    @Autowired
    public InvitationsController(InvitationService invitationService) {

        this.invitationService = invitationService;
    }
    @GetMapping("/getall")
    public List<GetAllInvitationResponse> getAll(){
        return invitationService.getAll();
    }
    @PostMapping("/add")

    public void add(@RequestBody CreateInvitationRequest createInvitationRequest){
        this.invitationService.add(createInvitationRequest);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteInvitationRequest deleteInvitationRequest){

        this.invitationService.delete(deleteInvitationRequest);
    }
    @PutMapping("/update")
    public void update(@RequestBody UpdateInvitationRequest updateInvitationRequest){

        this.invitationService.update(updateInvitationRequest);
    }


}
