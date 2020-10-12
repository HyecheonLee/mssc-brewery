package com.hyecheon.msscbrewery.services.v2;

import com.hyecheon.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * @author hyecheon
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}