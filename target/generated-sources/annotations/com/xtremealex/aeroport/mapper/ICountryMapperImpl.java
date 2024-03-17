package com.xtremealex.aeroport.mapper;

import com.xtremealex.aeroport.entity.CountryEntity;
import com.xtremealex.aeroport.models.web.response.countries.CountryDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-17T17:23:47+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (GraalVM Community)"
)
@Component
public class ICountryMapperImpl implements ICountryMapper {

    @Override
    public List<CountryDTO> entityListToDtoList(List<CountryEntity> entityPage) {
        if ( entityPage == null ) {
            return null;
        }

        List<CountryDTO> list = new ArrayList<CountryDTO>( entityPage.size() );
        for ( CountryEntity countryEntity : entityPage ) {
            list.add( entityToDto( countryEntity ) );
        }

        return list;
    }

    @Override
    public CountryDTO entityToDto(CountryEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CountryDTO countryDTO = new CountryDTO();

        countryDTO.setId( entity.getId() );
        countryDTO.setIsoCountry( entity.getIsoCountry() );
        countryDTO.setName( entity.getName() );
        countryDTO.setDescription( entity.getDescription() );

        return countryDTO;
    }

    @Override
    public CountryEntity dtoToEntity(CountryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CountryEntity countryEntity = new CountryEntity();

        countryEntity.setIsoCountry( dto.getIsoCountry() );
        countryEntity.setName( dto.getName() );

        return countryEntity;
    }
}
