package com.example.gticslab520212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ticket")
public class Ticket {
    @Id
    @Column(name = "ticketid")
    private String id;

    @Column(name = "status")
    private String status;

    @Column(name = "openeddate")
    private String openedDate;


    @ManyToOne
    @JoinColumn(name = "siteid")
    private Site site;

    @ManyToOne
    @JoinColumn(name = "technicianid")
    private Technician technician;


}
