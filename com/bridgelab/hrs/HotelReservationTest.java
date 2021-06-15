package com.bridgelab.hrs;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class HotelReservationTest {
	HotelReservation model = new HotelReservation();
	HotelReservationFunction hotelData = new HotelReservationRegularCustomer();

	@Test
	public void welcomeMessage() {
		HotelReservation model = new HotelReservation();
	}

	@Test
	public void addHotelNameAndRateForRegularCustomer() {
		// WeekDay And Weekend Data Set Separately At a Time Set For Only One and
		// Another one will be Null
		hotelData.addHotelNameAndRate("Lakewood", 110, "weekDay", null);
		hotelData.addHotelNameAndRate("Bridgewood", 160, "weekDay", null);
		hotelData.addHotelNameAndRate("Ridgewood", 220, "weekDay", null);
		hotelData.addHotelNameAndRate("Lakewood", 90, null, "weekend");
		hotelData.addHotelNameAndRate("Bridgewood", 60, null, "weekend");
		hotelData.addHotelNameAndRate("Ridgewood", 150, null, "weekend");
		int expected=6;
		int list=hotelData.getSizeOfList();
		assertEquals(expected,list);
	}
}
