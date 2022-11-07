package com.example.digitopia.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name="invitations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Invitation extends BaseEntity{
    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    @Column(name ="id")
    private int userId;

    @Column(name ="message")
    private String message;

    @Column(name ="status")
    private String status;

}
