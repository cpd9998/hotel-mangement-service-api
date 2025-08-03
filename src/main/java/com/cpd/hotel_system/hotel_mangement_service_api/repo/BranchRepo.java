package com.cpd.hotel_system.hotel_mangement_service_api.repo;

import com.cpd.hotel_system.hotel_mangement_service_api.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepo extends JpaRepository<Branch, String> {
}
