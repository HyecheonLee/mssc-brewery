package com.hyecheon.msscbrewery.services;

import com.hyecheon.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * @author hyecheon
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}