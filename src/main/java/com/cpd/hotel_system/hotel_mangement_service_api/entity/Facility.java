package com.cpd.hotel_system.hotel_mangement_service_api.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "facility")
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name",length = 100,nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;



}
