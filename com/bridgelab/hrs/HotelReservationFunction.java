package com.bridgelab.hrs;

public interface HotelReservationFunction {
	public void addHotelNameAndRate(String hotelName, Integer hotelRate, String weekDayRate, String weekendRate);
	public int getSizeOfList();
}
