package com.cpd.hotel_system.hotel_mangement_service_api.dto.response.paginate;

import com.cpd.hotel_system.hotel_mangement_service_api.dto.response.ResponseRoomDto;
import com.cpd.hotel_system.hotel_mangement_service_api.dto.response.ResponseRoomImageDto;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomImagePaginateResponseDto {
    private List<ResponseRoomImageDto> dataList;
    private long dataCount;
}
