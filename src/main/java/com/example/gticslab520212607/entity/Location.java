package com.example.gticslab520212607.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "location")
public class Location {

    @Id
    @Column(name = "locationid")
    private Integer id;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

}
