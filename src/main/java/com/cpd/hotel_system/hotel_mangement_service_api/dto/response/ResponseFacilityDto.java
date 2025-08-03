package com.cpd.hotel_system.hotel_mangement_service_api.dto.response;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseFacilityDto {
    private Long id;
    private String name;
    private String roomId;

}
