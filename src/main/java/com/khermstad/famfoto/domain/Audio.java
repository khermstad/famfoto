package com.khermstad.famfoto.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("audio")
public class Audio extends Media {

}
