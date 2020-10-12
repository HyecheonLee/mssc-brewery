package com.hyecheon.msscbrewery

import com.hyecheon.msscbrewery.web.model.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MsscBreweryApplication

fun main(args: Array<String>) {
	runApplication<MsscBreweryApplication>(*args)
	val beerDto = BeerDto()
	println(beerDto)
}
