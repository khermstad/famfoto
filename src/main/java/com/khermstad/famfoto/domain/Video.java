package com.khermstad.famfoto.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("video")
public class Video extends Media {

}
