package com.xtremealex.aeroport.models.web.response.countries;



import com.xtremealex.aeroport.models.web.response.airports.AirportDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryDTO implements Serializable {


    private static final long serialVersionUID = -4967230195811208915L;

    private Long id;

    private String isoCountry;

    private String name;

    private String description;

    private List<AirportDTO> airports;

    private LocalDateTime createdDate;

    private LocalDateTime lastModifiedDate;

    private String createdBy;

    private String lastModifiedBy;

}
