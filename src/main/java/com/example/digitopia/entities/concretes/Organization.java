package com.example.digitopia.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Organization extends BaseEntity{

    @Column(name ="organizationName")
    private String organizationName;

    @Column(name ="normalizedOrganizationName")
    private String normalizedOrganizationName;

    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    @Column(name ="registryNumber")
    private int registryNumber;

    @Column(name ="contactEmail")
    private String contactEmail;

    @Column(name ="yearFounded")
    private int yearFounded;

    @Column(name ="phone")
    private int phone;

    @Column(name ="companySize")
    private int companySize;
}
