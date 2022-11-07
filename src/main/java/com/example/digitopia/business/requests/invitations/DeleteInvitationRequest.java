package com.example.digitopia.business.requests.invitations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteInvitationRequest {
    private int userId;
    private String message;
    private String status;


}