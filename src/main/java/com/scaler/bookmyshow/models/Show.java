package com.scaler.bookmyshow.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "shows") // Show is a reserved keyword in MySQL
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;

    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Screen screen;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    List<Feature> features;
}

/*
     1      1
    show   movie ==> m:1
     m       1

     1 ->   1
    Show   Screen
      M  <-   1


       1   ->  M
      Show   Features ->  m : m
        m   <-     1


 */