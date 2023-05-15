package com.codesegment.api.base.controller;

import com.codesegment.api.base.shared.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/base")
public class BaseController {
   @GetMapping(value="/test" )
    public ResponseEntity<BaseResponse<String>> test() {
        BaseResponse<String> response = new BaseResponse<>();
        response.setData("First Step -- 17-1-2023");
        return ResponseEntity.ok(response);
    }
}


