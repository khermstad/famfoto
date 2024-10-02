package com.khermstad.famfoto.domain;

import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @Column(name = "id")
    UUID id = UUID.randomUUID();

    @Column(name = "createdDate")
    ZonedDateTime createdDate;

    @Column(name = "updatedDate")
    ZonedDateTime updatedDate;

    @Column(name = "text")
    String text;

    @ManyToOne
    @JoinColumn(name = "media_id", referencedColumnName = "id")
    Media media;

    @OneToOne
    @JoinColumn(name = "creator_id", referencedColumnName = "id")
    User creator;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(id, tag.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
