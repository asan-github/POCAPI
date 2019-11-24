package com.api.model;

import java.util.List;

public class LegacyAutoPolicyBO
{
	List<DriverBO> driverBO;
	
	int vehicleYear;
	String vehicleMake;
	String vehicleModel;

	public int getVehicleYear() {
		return vehicleYear;
	}

	public void setVehicleYear(int vehicleYear) {
		this.vehicleYear = vehicleYear;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public List<DriverBO> getDriverBO() {
		return driverBO;
	}

	public void setDriverBO(List<DriverBO> driverBO) {
		this.driverBO = driverBO;
	}
	
}
