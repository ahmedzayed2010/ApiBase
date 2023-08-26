package com.codesegment.api.base.service;

import com.codesegment.api.base.dto.RegionDto;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class RegionService {


    public List<RegionDto> getAllRegions() {
        List<RegionDto> list = new ArrayList<>();
      /*  List<Region> regions =new ArrayList<>();
        for (Region r:regions
             ) {
            RegionDto dto  = new RegionDto();
            dto.setRegionId(r.getRegionId());
            dto.setRegionName(r.getRegionName());
list.add(dto);
        }*/
        return list;
    }
}
