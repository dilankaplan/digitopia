package com.example.digitopia.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllInvitationResponse {
    private int id;
    private String message;
    private String status;
}
