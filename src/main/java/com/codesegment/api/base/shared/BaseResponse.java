package com.codesegment.api.base.shared;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class BaseResponse<T> {

   private String httpRequestId;
    private Long itemCount;
    private Integer statusCode;
    private String statusName;
    private T data;
    private List<String> errorList;
}
