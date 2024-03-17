package com.xtremealex.aeroport.mapper;

import com.xtremealex.aeroport.entity.typological.AirportTypeTypology;
import com.xtremealex.aeroport.models.web.response.airports.AirportTypeDTO;
import com.xtremealex.aeroport.utility.IStringConverter;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-17T17:23:47+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (GraalVM Community)"
)
@Component
public class IAirportTypeTypologyMapperImpl implements IAirportTypeTypologyMapper {

    @Autowired
    private IStringConverter iStringConverter;

    @Override
    public AirportTypeDTO entityToDto(AirportTypeTypology entity) {
        if ( entity == null ) {
            return null;
        }

        AirportTypeDTO airportTypeDTO = new AirportTypeDTO();

        airportTypeDTO.setId( iStringConverter.getId( entity.getId() ) );
        airportTypeDTO.setName( entity.getName() );
        airportTypeDTO.setDescription( entity.getDescription() );
        airportTypeDTO.setCreatedDate( entity.getCreatedDate() );
        airportTypeDTO.setLastModifiedDate( entity.getLastModifiedDate() );
        airportTypeDTO.setCreatedBy( entity.getCreatedBy() );
        airportTypeDTO.setLastModifiedBy( entity.getLastModifiedBy() );

        return airportTypeDTO;
    }

    @Override
    public AirportTypeTypology dtoToEntity(AirportTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AirportTypeTypology airportTypeTypology = new AirportTypeTypology();

        airportTypeTypology.setName( dto.getName() );

        return airportTypeTypology;
    }
}
