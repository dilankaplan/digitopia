package com.example.digitopia.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllOrganizationResponse {

    private String organizationName;
    private String normalizedOrganizationName;
    private int registryNumber;
    private String contactEmail;
    private int yearFounded;
    private int phone;
    private int companySize;


}
