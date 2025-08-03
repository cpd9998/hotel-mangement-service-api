package com.cpd.hotel_system.hotel_mangement_service_api.repo;

import com.cpd.hotel_system.hotel_mangement_service_api.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
