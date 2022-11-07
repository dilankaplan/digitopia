package com.example.digitopia.dataAccess.abstracts;

import com.example.digitopia.entities.concretes.Invitation;
import com.example.digitopia.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvitationRepository extends JpaRepository<Invitation,String > {
}
