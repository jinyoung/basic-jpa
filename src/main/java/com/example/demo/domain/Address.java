package com.example.demo.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Address {
    
    String addressState;
    String city;
}
