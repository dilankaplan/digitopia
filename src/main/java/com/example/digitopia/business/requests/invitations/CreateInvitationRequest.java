package com.example.digitopia.business.requests.invitations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateInvitationRequest {
    private String message;
    private String status;


}
