package com.csk.beer.inventory.service.web.mappers;

import com.csk.beer.inventory.service.domain.BeerInventory;
import com.csk.brewery.model.BeerInventoryDto;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-25T16:17:58+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.13 (Ubuntu)"
)
@Component
public class BeerInventoryMapperImpl implements BeerInventoryMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO) {
        if ( beerInventoryDTO == null ) {
            return null;
        }

        BeerInventory beerInventory = new BeerInventory();

        beerInventory.setId( beerInventoryDTO.getId() );
        beerInventory.setCreatedDate( dateMapper.asTimestamp( beerInventoryDTO.getCreatedDate() ) );
        beerInventory.setLastModifiedDate( dateMapper.asTimestamp( beerInventoryDTO.getLastModifiedDate() ) );
        beerInventory.setBeerId( beerInventoryDTO.getBeerId() );
        beerInventory.setQuantityOnHand( beerInventoryDTO.getQuantityOnHand() );

        return beerInventory;
    }

    @Override
    public BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory) {
        if ( beerInventory == null ) {
            return null;
        }

        BeerInventoryDto beerInventoryDto = new BeerInventoryDto();

        beerInventoryDto.setId( beerInventory.getId() );
        beerInventoryDto.setCreatedDate( dateMapper.asOffsetDateTime( beerInventory.getCreatedDate() ) );
        beerInventoryDto.setLastModifiedDate( dateMapper.asOffsetDateTime( beerInventory.getLastModifiedDate() ) );
        beerInventoryDto.setBeerId( beerInventory.getBeerId() );
        beerInventoryDto.setQuantityOnHand( beerInventory.getQuantityOnHand() );

        return beerInventoryDto;
    }
}
