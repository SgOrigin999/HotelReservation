package com.bridgelab.hrs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelReservationRegularCustomer implements HotelReservationFunction {
	HotelReservation hotelData = new HotelReservation();
	public Map<String, Integer> regularWeekDayRate = new HashMap<String, Integer>();
	public Map<String, Integer> regularWeekendRate = new HashMap<String, Integer>();
	public List<Object> listOfRegularRate = new ArrayList<>();
	public int listSize = 0;
	
	@Override
	public void addHotelNameAndRate(String hotelName, Integer hotelRate, String weekDayRate, String weekendRate) {
		HotelReservation model = new HotelReservation(hotelName, hotelRate);
		if (weekDayRate != null) {
			regularWeekDayRate.put(hotelName, hotelRate);
			listOfRegularRate.add(model);
		} else if (weekendRate != null) {
			regularWeekendRate.put(hotelName, hotelRate);
			listOfRegularRate.add(model);
		}
		listSize = listOfRegularRate.size();	
		hotelData.setCount(listSize);
	}

	@Override
	public int getSizeOfList() {
		return hotelData.getCount();
	}
}
