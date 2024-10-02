package com.khermstad.famfoto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.ZonedDateTime;
import java.util.UUID;

public class Person {

    @Id
    @Column(name = "id")
    UUID id = UUID.randomUUID();

    @Column(name = "createdDate")
    ZonedDateTime createdDate;

    @Column(name = "updatedDate")
    ZonedDateTime updatedDate;

}
