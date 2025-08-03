package com.cpd.hotel_system.hotel_mangement_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Blob;

@Entity
@Table(name="hotel")
public class Hotel {

    @Id
    @Column(name="hotel_id",length = 80 )
    private String hotelId;

    @Column(name = "name",nullable = false,length = 100)
    private String hotelName;

    @Column(name = "star_rating",nullable = false)
    private int starRating;

    @Column(nullable = false)
    @Lob
    private Blob description;

    @Column(name = "created_at",nullable = false)
    private LocalDate createdAt;

    @Column(name = "updated_at",nullable = false)
    private LocalDate updatedAt;

    @Column(name = "active_status")
    private boolean activeStatus;

    @Column(name = "starting_from")
    private BigDecimal startingFrom;







}
