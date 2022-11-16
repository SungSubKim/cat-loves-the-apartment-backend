package com.ssafy.vue.model;

public class HousedealDto {
	String apartmentName;
	String dong;
	String latitude;
	String longitude;
	String amount;
	String floor;
	String area;
	@Override
	public String toString() {
		return String.format("[apartmentName: %s], [dong: %s], [latitude: %s], [longitude: %s]", 
			apartmentName, dong, latitude, longitude);
	}
	public HousedealDto() {}
	public HousedealDto(String apartmentName, String floor, String area, String dong, String amount, String latitude,
			String longitude) {
		super();
		this.apartmentName = apartmentName;
		this.floor = floor;
		this.area = area;
		this.dong = dong;
		this.amount = amount;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}