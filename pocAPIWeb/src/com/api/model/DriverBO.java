package com.api.model;

import java.util.Calendar;

public class DriverBO {
	
	String driverFirstName;
	String driverLastName;
	String driverLicense;
	Calendar driverDOB;
	
	public String getDriverFirstName() {
		return driverFirstName;
	}
	public void setDriverFirstName(String driverFirstName) {
		this.driverFirstName = driverFirstName;
	}
	public String getDriverLastName() {
		return driverLastName;
	}
	public void setDriverLastName(String driverLastName) {
		this.driverLastName = driverLastName;
	}
	public String getDriverLicense() {
		return driverLicense;
	}
	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}
	public Calendar getDriverDOB() {
		return driverDOB;
	}
	public void setDriverDOB(Calendar driverDOB) {
		this.driverDOB = driverDOB;
	}


}
