package com.example.gticslab520212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "device")
public class Device {

    @Id
    @Column(name = "deviceid")
    private Integer id;

    @Column(name = "devicename")
    private String deviceName;

    @Column(name = "devicetype")
    private String deviceType;

    @Column(name = "model")
    private String model;

    @Column(name = "serialnumber")
    private String serialNumber;

    @ManyToOne
    @JoinColumn(name = "siteid")
    private Site site;

}
