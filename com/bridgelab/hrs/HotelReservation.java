package com.bridgelab.hrs;

public class HotelReservation {
	private String hotelName;
	private Integer hotelRate;
	private String customerType;
	private Integer rating;
	private String weekDayRate;
	private String weekendRate;
	private String regularCustomer;
	private String rewardCustomer;
	private String date;
	private int count;

	public HotelReservation() {
		super();
		System.out.println("Welcome To Hotel Reservation System::");
	}

	public HotelReservation(String hotelName, Integer hotelRate) {
		super();
		this.hotelName = hotelName;
		this.hotelRate = hotelRate;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Integer getHotelRate() {
		return hotelRate;
	}

	public void setHotelRate(Integer hotelRate) {
		this.hotelRate = hotelRate;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getWeekDayRate() {
		return weekDayRate;
	}

	public void setWeekDayRate(String weekDayRate) {
		this.weekDayRate = weekDayRate;
	}

	public String getWeekendRate() {
		return weekendRate;
	}

	public void setWeekendRate(String weekendRate) {
		this.weekendRate = weekendRate;
	}

	public String getRegularCustomer() {
		return regularCustomer;
	}

	public void setRegularCustomer(String regularCustomer) {
		this.regularCustomer = regularCustomer;
	}

	public String getRewardCustomer() {
		return rewardCustomer;
	}

	public void setRewardCustomer(String rewardCustomer) {
		this.rewardCustomer = rewardCustomer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "HotelReservation [hotelName=" + hotelName + ", hotelRate=" + hotelRate + ", customerType="
				+ customerType + ", rating=" + rating + ", weekDayRate=" + weekDayRate + ", weekendRate=" + weekendRate
				+ ", regularCustomer=" + regularCustomer + ", rewardCustomer=" + rewardCustomer + ", date=" + date
				+ ", count=" + count + "]";
	}
	
}
