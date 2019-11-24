package com.api.model;

public class UnifiedUmbrellaPolicyBO
{
	Location location;
	Double liabilityLimit;
	Double monthlyPremium;
	Double yearlyPremium;
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Double getLiabilityLimit() {
		return liabilityLimit;
	}
	public void setLiabilityLimit(Double liabilityLimit) {
		this.liabilityLimit = liabilityLimit;
	}
	public Double getMonthlyPremium() {
		return monthlyPremium;
	}
	public void setMonthlyPremium(Double monthlyPremium) {
		this.monthlyPremium = monthlyPremium;
	}
	public Double getYearlyPremium() {
		return yearlyPremium;
	}
	public void setYearlyPremium(Double yearlyPremium) {
		this.yearlyPremium = yearlyPremium;
	}
	
}
