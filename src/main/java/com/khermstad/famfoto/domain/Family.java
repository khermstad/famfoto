package com.khermstad.famfoto.domain;

import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Objects;
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
    @JoinTable
    List<Person> members;

    @OneToMany
    @JoinTable
    List<Pet> pets;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public ZonedDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(ZonedDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(id, family.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
