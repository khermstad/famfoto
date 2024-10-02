package com.khermstad.famfoto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;


public class Image {

    @Id
    @Column(name = "id")
    UUID id = UUID.randomUUID();

    @Column(name = "createdDate")
    ZonedDateTime createdDate;

    @Column(name = "updatedDate")
    ZonedDateTime updatedDate;

    @Column(name = "fileLocation")
    String fileLocation;

    @JoinTable
    List<Comment> comments;

    @JoinTable
    List<Tag> tags;

}
