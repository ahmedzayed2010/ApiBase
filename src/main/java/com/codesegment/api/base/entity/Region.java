package com.codesegment.api.base.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "REGIONS" , schema = "hr")
public class Region {
    @Id
    @Column(name = "REGION_ID")
    private Long regionId ;

    @Column(name="REGION_NAME")
    private String regionName;
}
