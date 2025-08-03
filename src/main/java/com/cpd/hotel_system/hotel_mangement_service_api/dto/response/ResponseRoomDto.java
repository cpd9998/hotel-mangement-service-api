package com.cpd.hotel_system.hotel_mangement_service_api.dto.response;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseRoomDto {
    private String roomId;
    private int bedCount;
    private boolean isAvailable;
    private BigDecimal price;
    private String roomNumber;
    private String roomType;
    private String branchId;
    private List<ResponseFacilityDto> facilities;
    private List<ResponseRoomImageDto> images;



}
