package com.example.digitopia.webApi.controller;

import com.example.digitopia.business.abstracts.OrganizationService;
import com.example.digitopia.business.requests.organizations.CreateOrganizationsRequest;
import com.example.digitopia.business.requests.organizations.DeleteOrganizationsRequest;
import com.example.digitopia.business.requests.organizations.UpdateOrganizationRequest;

import com.example.digitopia.business.responses.GetAllUsersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationsController {
    private OrganizationService organizationService;

    @Autowired
    public OrganizationsController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }
    @GetMapping("/getall")
    public List<GetAllUsersResponse> getAll(){

        return organizationService.getAll();
    }
    @PostMapping("/add")

    public void add(@RequestBody CreateOrganizationsRequest createOrganizationsRequest){
        this.organizationService.add(createOrganizationsRequest);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteOrganizationsRequest deleteOrganizationsRequest){
        this.organizationService.delete(deleteOrganizationsRequest);
    }
    @PutMapping("/update")
    public void update(@RequestBody UpdateOrganizationRequest updateOrganizationRequest){
        this.organizationService.update(updateOrganizationRequest);
    }

}
