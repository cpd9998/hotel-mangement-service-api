package com.cpd.hotel_system.hotel_mangement_service_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "room_image")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoomImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private FileFormatter fileFormatter;

    @ManyToOne()
    @JoinColumn(name = "room_id")
    private Room room;

}
