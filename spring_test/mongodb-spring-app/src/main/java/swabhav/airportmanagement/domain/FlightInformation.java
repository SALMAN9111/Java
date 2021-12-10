package swabhav.airportmanagement.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class FlightInformation {
	@Id
	private String id;
	
	@Field("departure")
	@Indexed
	private String departurecity;
	
	@Field("destination")
	@Indexed
	private String destinationCity;
	
	private FlightType type;
	private boolean isDelayed;
	private int durationMin;
	private LocalDate departureDate;
	private Aircraft aircraft;
	
	@Transient
	private LocalDate createAt;
	
	public FlightInformation() {
		this.createAt = LocalDate.now();
	}

	public String getId() {
		return id;
	}

	public String getDeparturecity() {
		return departurecity;
	}

	public void setDeparturecity(String departurecity) {
		this.departurecity = departurecity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public FlightType getType() {
		return type;
	}

	public void setType(FlightType type) {
		this.type = type;
	}

	public boolean isDelayed() {
		return isDelayed;
	}

	public void setDelayed(boolean isDelayed) {
		this.isDelayed = isDelayed;
	}

	public int getDurationMin() {
		return durationMin;
	}

	public void setDurationMin(int durationMin) {
		this.durationMin = durationMin;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	public LocalDate getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}
}
