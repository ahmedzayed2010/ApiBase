package com.codesegment.api.base.controller;

import com.codesegment.api.base.dto.RegionDto;
import com.codesegment.api.base.service.RegionService;
import com.codesegment.api.base.shared.BaseResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/regions")

public class RegionController extends BaseController{
    @Autowired
    private  RegionService regionService;
    @GetMapping(value = "/all-regions" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse<List<RegionDto>>> getAllRegions(){
        BaseResponse response  = new BaseResponse();
        List<RegionDto> allRegions = regionService.getAllRegions();
        response.setData(allRegions);
        return ResponseEntity.ok().body(response);

    }
}

