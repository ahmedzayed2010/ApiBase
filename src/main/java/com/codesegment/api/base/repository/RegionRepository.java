package com.codesegment.api.base.repository;

import com.codesegment.api.base.entity.Region;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface RegionRepository extends JpaRepository<Region, Long> {
}
