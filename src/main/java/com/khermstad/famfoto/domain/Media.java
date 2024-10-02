package com.khermstad.famfoto.domain;

import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "media")
public class Media {
    @Id
    @Column(name = "id")
    UUID id = UUID.randomUUID();

    @Column(name = "createdDate")
    ZonedDateTime createdDate;

    @Column(name = "updatedDate")
    ZonedDateTime updatedDate;

    @Column(name = "fileLocation")
    String fileLocation;

    @OneToMany(mappedBy = "media")
    List<Comment> comments;

    @OneToMany(mappedBy = "media")
    List<Tag> tags;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return Objects.equals(id, media.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
