package com.khermstad.famfoto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Table(name = "family")
public class Family {

    @Id
    @Column(name = "id")
    UUID id = UUID.randomUUID();

    @Column(name = "name")
    String name;

    @Column(name = "createdDate")
    ZonedDateTime createdDate;

    @Column(name = "updatedDate")
    ZonedDateTime updatedDate;



}
