package com.example.digitopia.dataAccess.abstracts;

import com.example.digitopia.entities.concretes.Organization;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrganizationRepository extends JpaRepository <Organization,String > {

}
