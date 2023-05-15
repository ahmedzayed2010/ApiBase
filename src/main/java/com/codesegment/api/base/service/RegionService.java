package com.codesegment.api.base.service;

import com.codesegment.api.base.dto.RegionDto;
import com.codesegment.api.base.entity.Region;
import com.codesegment.api.base.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionService {
    @Autowired
    private  RegionRepository regionRepository;
    @Transactional(readOnly = true)
    public List<RegionDto> getAllRegions(){
        List<RegionDto> list = new ArrayList<>();
        List<Region> regions = regionRepository.findAll();
        for (Region r:regions
             ) {
            RegionDto dto  = new RegionDto();
            dto.setRegionId(r.getRegionId());
            dto.setRegionName(r.getRegionName());
list.add(dto);
        }
        return list;
    }
}
