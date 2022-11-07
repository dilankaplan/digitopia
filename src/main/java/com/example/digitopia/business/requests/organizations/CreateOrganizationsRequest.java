package com.example.digitopia.business.requests.organizations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrganizationsRequest {
    private String organizationName;
    private String normalizedOrganizationName;
    private int registryNumber;
    private String contactEmail;
    private int yearFounded;
    private int phone;
    private int companySize;
}
