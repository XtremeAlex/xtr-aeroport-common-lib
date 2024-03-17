package com.xtremealex.aeroport.mapper;

import com.xtremealex.aeroport.entity.AirportEntity;
import com.xtremealex.aeroport.entity.typological.AirportTypeTypology;
import com.xtremealex.aeroport.models.web.response.airports.AirportDTO;
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
public class IAirportMapperImpl implements IAirportMapper {

    @Autowired
    private IStringConverter iStringConverter;

    @Override
    public AirportDTO entityToDto(AirportEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AirportDTO airportDTO = new AirportDTO();

        airportDTO.setId( iStringConverter.getId( entity.getId() ) );
        airportDTO.setContinent( entity.getContinent() );
        airportDTO.setCoordinates( entity.getCoordinates() );
        airportDTO.setElevationFt( entity.getElevationFt() );
        airportDTO.setGpsCode( entity.getGpsCode() );
        airportDTO.setIataCode( entity.getIataCode() );
        airportDTO.setIdent( entity.getIdent() );
        airportDTO.setIsoCountry( entity.getIsoCountry() );
        airportDTO.setIsoRegion( entity.getIsoRegion() );
        airportDTO.setMunicipality( entity.getMunicipality() );
        airportDTO.setName( entity.getName() );
        airportDTO.setAirportType( airportTypeTypologyToAirportTypeDTO( entity.getAirportType() ) );

        return airportDTO;
    }

    @Override
    public AirportEntity dtoToEntity(AirportDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AirportEntity airportEntity = new AirportEntity();

        airportEntity.setContinent( dto.getContinent() );
        airportEntity.setCoordinates( dto.getCoordinates() );
        airportEntity.setElevationFt( dto.getElevationFt() );
        airportEntity.setGpsCode( dto.getGpsCode() );
        airportEntity.setIataCode( dto.getIataCode() );
        airportEntity.setIdent( dto.getIdent() );
        airportEntity.setIsoCountry( dto.getIsoCountry() );
        airportEntity.setIsoRegion( dto.getIsoRegion() );
        airportEntity.setMunicipality( dto.getMunicipality() );
        airportEntity.setName( dto.getName() );
        airportEntity.setAirportType( airportTypeDTOToAirportTypeTypology( dto.getAirportType() ) );

        return airportEntity;
    }

    protected AirportTypeDTO airportTypeTypologyToAirportTypeDTO(AirportTypeTypology airportTypeTypology) {
        if ( airportTypeTypology == null ) {
            return null;
        }

        AirportTypeDTO airportTypeDTO = new AirportTypeDTO();

        airportTypeDTO.setId( iStringConverter.getId( airportTypeTypology.getId() ) );
        airportTypeDTO.setName( airportTypeTypology.getName() );
        airportTypeDTO.setDescription( airportTypeTypology.getDescription() );
        airportTypeDTO.setCreatedDate( airportTypeTypology.getCreatedDate() );
        airportTypeDTO.setLastModifiedDate( airportTypeTypology.getLastModifiedDate() );
        airportTypeDTO.setCreatedBy( airportTypeTypology.getCreatedBy() );
        airportTypeDTO.setLastModifiedBy( airportTypeTypology.getLastModifiedBy() );

        return airportTypeDTO;
    }

    protected AirportTypeTypology airportTypeDTOToAirportTypeTypology(AirportTypeDTO airportTypeDTO) {
        if ( airportTypeDTO == null ) {
            return null;
        }

        AirportTypeTypology airportTypeTypology = new AirportTypeTypology();

        airportTypeTypology.setId( iStringConverter.setId( airportTypeDTO.getId() ) );
        airportTypeTypology.setName( airportTypeDTO.getName() );
        airportTypeTypology.setDescription( airportTypeDTO.getDescription() );
        airportTypeTypology.setCreatedDate( airportTypeDTO.getCreatedDate() );
        airportTypeTypology.setLastModifiedDate( airportTypeDTO.getLastModifiedDate() );
        airportTypeTypology.setCreatedBy( airportTypeDTO.getCreatedBy() );
        airportTypeTypology.setLastModifiedBy( airportTypeDTO.getLastModifiedBy() );

        return airportTypeTypology;
    }
}
