package com.scaler.bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{

    private String number;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
    private int rowVal;
    private int colVal;
}
