package com.csk.brewery.model.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeerEvent implements Serializable {

	private static final long serialVersionUID = -5487107846192253630L;
	
	private BeerDto beerDTO;

}
