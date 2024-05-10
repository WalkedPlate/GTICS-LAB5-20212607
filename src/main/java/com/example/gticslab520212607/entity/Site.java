package com.example.gticslab520212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "site")
public class Site {

    @Id
    @Column(name = "siteid")
    private Integer id;

    @Column(name = "sitename")
    private String siteName;

    @Column(name = "installationdate")
    private String installationDate;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @ManyToOne
    @JoinColumn(name = "LocationID")
    private Location location;
}