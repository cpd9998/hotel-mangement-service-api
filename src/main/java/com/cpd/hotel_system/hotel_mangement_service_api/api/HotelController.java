package com.cpd.hotel_system.hotel_mangement_service_api.api;


import com.cpd.hotel_system.hotel_mangement_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_mangement_service_api.service.HotelService;
import com.cpd.hotel_system.hotel_mangement_service_api.util.StandardResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotel-management/api/v1/hotels")
public class HotelController {
   private final HotelService hotelService;
    @PostMapping("/user/create")
    public ResponseEntity<StandardResponseDto>create(
            @RequestBody RequestHotelDto dto) throws SQLException {
        hotelService.create(dto);
        return new ResponseEntity<>(new StandardResponseDto(
            201,"Hotel saved",null
        ),
        HttpStatus.CREATED
      );
    }

}
