package com.xtremealex.aeroport.models.web.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirportSearchRequest implements Serializable {

    private static final long serialVersionUID = 1669401598047473141L;
    private Set<String> types;
    private String isoCountry;
    private String name;
    private Integer pageNumber;
    private Integer pageSize;
    private String sortField;
    private String sortDir;
}