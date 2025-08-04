package com.cpd.hotel_system.hotel_mangement_service_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "room")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Room {
    @Id
    @Column(name = "room_id")
    private String roomId;

    @Column(name = "room_number",length = 80,nullable = false)
    private String roomNumber;

    @Column(name = "type",length = 80,nullable = false)
    private String type;

    @Column(name = "bed_count")
    private int bedCount;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "is_available")
    private boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @OneToMany(mappedBy = "room")
    private List<Facility> facility;


    @OneToMany(mappedBy = "room")
    private  List<RoomImage> roomImages;

}
