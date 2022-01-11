package com.csk.beer.inventory.service.web.mappers;

import org.mapstruct.Mapper;

import com.csk.beer.inventory.service.domain.BeerInventory;
import com.csk.brewery.model.BeerInventoryDto;

/**
 * Created by jt on 2019-05-31.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
