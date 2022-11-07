package com.example.digitopia.entities.concretes;

import lombok.*;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;

import javax.persistence.*;


@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class User extends BaseEntity {
    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(name ="status")
    private String status;

    @Column(name ="fullName")
    private String fullName;

    @Column(name ="email")
    private String email;

    @Column(name ="normalizedName")
    private String normalizedName;


}