package com.khermstad.famfoto.domain;

import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.List;
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

    @OneToMany
    @JoinColumn(name = "person_id")
    List<Person> members;

    @OneToMany
    @JoinColumn(name = "animal_id")
    List<Animal> pets;

}
