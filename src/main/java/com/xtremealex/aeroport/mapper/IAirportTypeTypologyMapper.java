package com.xtremealex.aeroport.mapper;

import com.xtremealex.aeroport.entity.typological.AirportTypeTypology;
import com.xtremealex.aeroport.models.web.response.airports.AirportTypeDTO;

import com.xtremealex.aeroport.utility.IStringConverter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring" , uses = IStringConverter.class)
public interface IAirportTypeTypologyMapper {

    AirportTypeDTO entityToDto(AirportTypeTypology entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "description", ignore = true)
    @Mapping(target = "createdDate", ignore = true)
    @Mapping(target = "lastModifiedDate", ignore = true)
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "lastModifiedBy", ignore = true)
    AirportTypeTypology dtoToEntity(AirportTypeDTO dto);

    default Page<AirportTypeDTO> entityPageToDtoPage(Page<AirportTypeTypology> entityPage, Pageable pageable) {
        List<AirportTypeDTO> dtoList = entityPage.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());

        return new PageImpl<>(dtoList, pageable, entityPage.getTotalElements());
    }
}
