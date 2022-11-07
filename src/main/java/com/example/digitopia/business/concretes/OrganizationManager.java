package com.example.digitopia.business.concretes;

import com.example.digitopia.business.abstracts.OrganizationService;

import com.example.digitopia.business.requests.organizations.CreateOrganizationsRequest;
import com.example.digitopia.business.requests.organizations.DeleteOrganizationsRequest;
import com.example.digitopia.business.requests.organizations.UpdateOrganizationRequest;
import com.example.digitopia.business.responses.GetAllOrganizationResponse;
import com.example.digitopia.dataAccess.abstracts.OrganizationRepository;
import com.example.digitopia.entities.concretes.Organization;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class OrganizationManager implements OrganizationService {

    private OrganizationRepository organizationRepository ;
    @Autowired
    public OrganizationManager(OrganizationRepository organizationRepository) {

        this.organizationRepository = organizationRepository;
    }
    @Override
    public List<GetAllOrganizationResponse> getAll() {
        List<Organization> organizations = organizationRepository.findAll();
        List<GetAllOrganizationResponse> organizationResponses =
                new ArrayList<GetAllOrganizationResponse>();
        for(Organization organization:organizations){
            GetAllOrganizationResponse responseItem = new GetAllOrganizationResponse();
            responseItem.setOrganizationName(organization.getOrganizationName());
            responseItem.setNormalizedOrganizationName(organization.getNormalizedOrganizationName());
            responseItem.setContactEmail(organization.getContactEmail());
            responseItem.setRegistryNumber(organization.getRegistryNumber());
            responseItem.setYearFounded(organization.getYearFounded());
            responseItem.setPhone(organization.getPhone());
            responseItem.setCompanySize(organization.getCompanySize());

            organizationResponses.add(responseItem);
        }
        return organizationResponses;
    }

    @Override
    public void add(CreateOrganizationsRequest createOrganizationsRequest) {
        Organization organization = new Organization();
        organization.setOrganizationName(createOrganizationsRequest.getOrganizationName());
        organization.setNormalizedOrganizationName(createOrganizationsRequest.getNormalizedOrganizationName());
        organization.setRegistryNumber(createOrganizationsRequest.getRegistryNumber());
        organization.setContactEmail(createOrganizationsRequest.getContactEmail());
        organization.setYearFounded(createOrganizationsRequest.getYearFounded());
        organization.setPhone(createOrganizationsRequest.getPhone());
        organization.setCompanySize(createOrganizationsRequest.getCompanySize());
        this.organizationRepository.save(organization);
    }

    @Override
    public void delete(DeleteOrganizationsRequest deleteOrganizationsRequest) {
        Organization organization = new Organization();
        organization.setOrganizationName(deleteOrganizationsRequest.getOrganizationName());
        organization.setNormalizedOrganizationName(deleteOrganizationsRequest.getNormalizedOrganizationName());
        organization.setRegistryNumber(deleteOrganizationsRequest.getRegistryNumber());
        organization.setContactEmail(deleteOrganizationsRequest.getContactEmail());
        organization.setYearFounded(deleteOrganizationsRequest.getYearFounded());
        organization.setPhone(deleteOrganizationsRequest.getPhone());
        organization.setCompanySize(deleteOrganizationsRequest.getCompanySize());
        this.organizationRepository.delete(organization);

    }

    @Override
    public void update(UpdateOrganizationRequest updateOrganizationRequest) {
        Organization organization = new Organization();
        organization.setOrganizationName(updateOrganizationRequest.getOrganizationName());
        organization.setNormalizedOrganizationName(updateOrganizationRequest.getNormalizedOrganizationName());
        organization.setContactEmail(updateOrganizationRequest.getContactEmail());
        organization.setYearFounded(updateOrganizationRequest.getYearFounded());
        organization.setPhone(updateOrganizationRequest.getPhone());
        organization.setCompanySize(updateOrganizationRequest.getCompanySize());
        this.organizationRepository.update(organization);

    }
}
