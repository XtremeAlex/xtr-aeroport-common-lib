package com.xtremealex.aeroport.mapper;

import com.xtremealex.aeroport.entity.AirportEntity;
import com.xtremealex.aeroport.models.web.response.airports.AirportDTO;
import com.xtremealex.aeroport.utility.IStringConverter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring" , uses = IStringConverter.class)
public interface IAirportMapper {

    //MapStruct non supporta direttamente la mappatura di tipi parametrizzati come Page<T>
    //Page<AirportDTO> entityPageToDtoPage(Page<AirportEntity> entityPage);

    //Risolviamo cosi:
    default Page<AirportDTO> entityPageToDtoPage(Page<AirportEntity> entityPage, Pageable pageable) {
        List<AirportDTO> dtoList = entityPage.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());

        return new PageImpl<>(dtoList, pageable, entityPage.getTotalElements());
    }

    @Mapping(target = "createdDate", ignore = true)
    @Mapping(target = "lastModifiedDate", ignore = true)
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "lastModifiedBy", ignore = true)
    AirportDTO entityToDto(AirportEntity entity);

    //@Mapping(target = "id", source = "id", qualifiedByName = "convertStringBase64ToLong")
    @Mapping(target = "id", ignore = true)
    //@Mapping(target = "airportType", ignore = true)
    @Mapping(target = "type", ignore = true)
    AirportEntity dtoToEntity(AirportDTO dto);

}
