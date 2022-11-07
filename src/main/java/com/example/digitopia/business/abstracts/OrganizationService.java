package com.example.digitopia.business.abstracts;

import com.example.digitopia.business.requests.organizations.CreateOrganizationsRequest;
import com.example.digitopia.business.requests.organizations.DeleteOrganizationsRequest;
import com.example.digitopia.business.requests.organizations.UpdateOrganizationRequest;
import com.example.digitopia.business.responses.GetAllOrganizationResponse;

import java.util.List;

public interface OrganizationService extends BaseService  {
    List<GetAllOrganizationResponse> getAll();
    void add(CreateOrganizationsRequest createOrganizationsRequest);
    void delete(DeleteOrganizationsRequest deleteOrganizationsRequest);
    void update(UpdateOrganizationRequest updateOrganizationRequest);
}
