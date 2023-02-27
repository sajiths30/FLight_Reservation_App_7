package com.Flight_Reservation_app_7.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractClass{
	private boolean checkedIn;
	private int numberOfBags;
	@OneToOne
	private Passenger passengerId;
	@OneToOne
	private Flight flight;
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Passenger passengerId) {
		this.passengerId = passengerId;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	

}
