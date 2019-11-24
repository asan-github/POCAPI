package com.api.model;

import java.util.Calendar;

public class UnifiedPolicyBO
{
	String policyNr;
	Calendar policyEffectiveDate;
	Calendar policyExpirationDate;
	public String getPolicyNr() {
		return policyNr;
	}
	public void setPolicyNr(String policyNr) {
		this.policyNr = policyNr;
	}
	public Calendar getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}
	public void setPolicyEffectiveDate(Calendar policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}
	public Calendar getPolicyExpirationDate() {
		return policyExpirationDate;
	}
	public void setPolicyExpirationDate(Calendar policyExpirationDate) {
		this.policyExpirationDate = policyExpirationDate;
	}
	
	
}
