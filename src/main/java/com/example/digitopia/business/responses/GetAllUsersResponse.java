package com.example.digitopia.business.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUsersResponse {
    private int id;
    private
    private String fullName;
    private String email;
    private String normalizedName;


}
