package com.csk.beer.inventory.service.listeners;

import com.csk.beer.inventory.service.config.JmsConfig;
import com.csk.beer.inventory.service.domain.BeerInventory;
import com.csk.brewery.model.events.NewInventoryEvent;
import com.csk.beer.inventory.service.repositories.BeerInventoryRepository;
import com.csk.brewery.model.events.BeerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class NewInventoryListener {

    private final BeerInventoryRepository beerInventoryRepository;

    @JmsListener(destination = JmsConfig.NEW_INVENTORY_QUEUE)
    public void newInventory(NewInventoryEvent inventoryEvent) {
        log.info("New Inventory Event... {}", inventoryEvent.toString());
        BeerDto beerDto = inventoryEvent.getBeerDTO();

        beerInventoryRepository.save(BeerInventory.builder()
                .beerId(beerDto.getId())
                .upc(beerDto.getUpc())
                .quantityOnHand(beerDto.getQuantityOnHand())
                .build());
    }


}
