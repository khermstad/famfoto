package com.khermstad.famfoto.domain;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("image")
public class Image extends Media {


}
