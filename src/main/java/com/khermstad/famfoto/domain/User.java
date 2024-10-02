package com.khermstad.famfoto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    UUID id = UUID.randomUUID();

    @Column(name = "firstName")
    String firstName;

    @Column(name = "middleName")
    String middleName;

    @Column(name = "lastName")
    String lastName;

    @Column(name = "email")
    String email;

    @Column(name = "createdDate")
    ZonedDateTime createdDate;

    @Column(name = "updatedDate")
    ZonedDateTime updatedDate;

}
