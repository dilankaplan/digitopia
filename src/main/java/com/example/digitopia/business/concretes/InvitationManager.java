package com.example.digitopia.business.concretes;

import com.example.digitopia.business.abstracts.InvitationService;
import com.example.digitopia.business.requests.invitations.CreateInvitationRequest;
import com.example.digitopia.business.requests.invitations.DeleteInvitationRequest;
import com.example.digitopia.business.requests.invitations.UpdateInvitationRequest;
import com.example.digitopia.business.responses.GetAllInvitationResponse;
import com.example.digitopia.dataAccess.abstracts.InvitationRepository;
import com.example.digitopia.entities.concretes.Invitation;
import com.example.digitopia.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvitationManager implements InvitationService {

    private InvitationRepository invitationRepository ;
    @Autowired
    public InvitationManager(InvitationRepository invitationRepository) {
        this.invitationRepository = invitationRepository;
    }

    @Override
    public List<GetAllInvitationResponse> getAll() {
        List<Invitation> invitations = invitationRepository.findAll();
        List<GetAllInvitationResponse> invitationResponses =
                new ArrayList<GetAllInvitationResponse>();
        for(Invitation invitation :invitations){
            GetAllInvitationResponse responseItem = new GetAllInvitationResponse();
            responseItem.setId(invitation.getUserId());
            responseItem.setMessage(invitation.getMessage());
            responseItem.setStatus(invitation.getStatus());

            invitationResponses.add(responseItem);
        }
        return invitationResponses;
    }

    @Override
    public void add(CreateInvitationRequest createInvitationRequest) {
        Invitation invitation = new Invitation();
        invitation.setMessage(createInvitationRequest.getMessage());
        this.invitationRepository.save(invitation);
    }

    @Override
    public void delete(DeleteInvitationRequest deleteInvitationRequest) {
        Invitation invitation = new Invitation();
        invitation.setMessage(deleteInvitationRequest.getMessage());
    }

    @Override
    public void update(UpdateInvitationRequest updateInvitationRequest) {
        Invitation invitation = new Invitation();
        invitation.setMessage(updateInvitationRequest.getMessage());
    }


}
