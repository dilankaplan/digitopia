package com.example.digitopia.dataAccess.abstracts;

import com.example.digitopia.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository extends JpaRepository<User,String > {



}
