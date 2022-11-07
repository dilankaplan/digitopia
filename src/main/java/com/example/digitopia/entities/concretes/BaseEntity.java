package com.example.digitopia.entities.concretes;
import java.util.UUID;

public class BaseEntity {
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();

    //String id = UUID.randomUUID().toString();
    private String id;
    private String createdDate; //date olmalılar
    private String updatedDate;
    private int createdUserId;
}
