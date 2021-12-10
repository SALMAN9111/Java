package com.monocept.mongodbspringapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import swabhav.airportmanagement.domain.Aircraft;
import swabhav.airportmanagement.domain.FlightInformation;
import swabhav.airportmanagement.domain.FlightType;

@Component
public class ApplicationRunner implements CommandLineRunner {

	private MongoTemplate mongoTemplate;

	public ApplicationRunner(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public void run(String... args) throws Exception {
		FlightInformation flightInfo = new FlightInformation();
		flightInfo.setAircraft(new Aircraft("Boeing 20", 60));
		flightInfo.setDeparturecity(("Mumbai"));
		flightInfo.setDestinationCity("Kochin");
		flightInfo.setType(FlightType.DOMESTIC);
		this.mongoTemplate.save(flightInfo);
		
		System.out.println("Application Started");

	}

}
