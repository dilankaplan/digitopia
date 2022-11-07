package com.example.digitopia.dataAccess.abstracts;

import com.example.digitopia.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository extends JpaRepository<User,String > {

    boolean existsByEmail(String email);
    UserRepository getUserByEmail(String email);

}
