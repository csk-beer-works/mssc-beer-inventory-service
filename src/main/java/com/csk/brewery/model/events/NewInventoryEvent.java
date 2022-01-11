package com.csk.brewery.model.events;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

	public NewInventoryEvent(BeerDto beerDTO) {
		super(beerDTO);
		
	}

}
