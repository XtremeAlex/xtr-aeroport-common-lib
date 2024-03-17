package com.xtremealex.aeroport.mapper;


import com.xtremealex.aeroport.entity.CountryEntity;
import com.xtremealex.aeroport.models.web.response.countries.CountryDTO;
import com.xtremealex.aeroport.utility.IStringConverter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring" , uses = IStringConverter.class)
public interface ICountryMapper {

    List<CountryDTO> entityListToDtoList(List<CountryEntity> entityPage);

    @Mapping(target = "airports", ignore = true)
    @Mapping(target = "createdDate", ignore = true)
    @Mapping(target = "lastModifiedDate", ignore = true)
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "lastModifiedBy", ignore = true)
    CountryDTO entityToDto(CountryEntity entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "description", ignore = true)
    CountryEntity dtoToEntity(CountryDTO dto);

}
