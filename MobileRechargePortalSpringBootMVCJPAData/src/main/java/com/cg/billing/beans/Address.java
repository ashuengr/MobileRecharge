package com.cg.billing.beans;
import javax.persistence.Embeddable;
@Embeddable
public class Address {
	private String homeAddressCity, homeAddressState;
	private int homeAddressPinCode;
	private String billingAddressCity, billingAddressState;
	private int billingAddressPinCode;
	public Address() {}
	public Address(String homeAddressCity, String homeAddressState, int homeAddressPinCode, String billingAddressCity,
			String billingAddressState, int billingAddressPinCode) {
		super();
		this.homeAddressCity = homeAddressCity;
		this.homeAddressState = homeAddressState;
		this.homeAddressPinCode = homeAddressPinCode;
		this.billingAddressCity = billingAddressCity;
		this.billingAddressState = billingAddressState;
		this.billingAddressPinCode = billingAddressPinCode;
	}
	public String getHomeAddressCity() {
		return homeAddressCity;
	}
	public void setHomeAddressCity(String homeAddressCity) {
		this.homeAddressCity = homeAddressCity;
	}
	public String getHomeAddressState() {
		return homeAddressState;
	}
	public void setHomeAddressState(String homeAddressState) {
		this.homeAddressState = homeAddressState;
	}
	public int getHomeAddressPinCode() {
		return homeAddressPinCode;
	}
	public void setHomeAddressPinCode(int homeAddressPinCode) {
		this.homeAddressPinCode = homeAddressPinCode;
	}
	public String getBillingAddressCity() {
		return billingAddressCity;
	}
	public void setBillingAddressCity(String billingAddressCity) {
		this.billingAddressCity = billingAddressCity;
	}
	public String getBillingAddressState() {
		return billingAddressState;
	}
	public void setBillingAddressState(String billingAddressState) {
		this.billingAddressState = billingAddressState;
	}
	public int getBillingAddressPinCode() {
		return billingAddressPinCode;
	}
	public void setBillingAddressPinCode(int billingAddressPinCode) {
		this.billingAddressPinCode = billingAddressPinCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((billingAddressCity == null) ? 0 : billingAddressCity.hashCode());
		result = prime * result + billingAddressPinCode;
		result = prime * result + ((billingAddressState == null) ? 0 : billingAddressState.hashCode());
		result = prime * result + ((homeAddressCity == null) ? 0 : homeAddressCity.hashCode());
		result = prime * result + homeAddressPinCode;
		result = prime * result + ((homeAddressState == null) ? 0 : homeAddressState.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (billingAddressCity == null) {
			if (other.billingAddressCity != null)
				return false;
		} else if (!billingAddressCity.equals(other.billingAddressCity))
			return false;
		if (billingAddressPinCode != other.billingAddressPinCode)
			return false;
		if (billingAddressState == null) {
			if (other.billingAddressState != null)
				return false;
		} else if (!billingAddressState.equals(other.billingAddressState))
			return false;
		if (homeAddressCity == null) {
			if (other.homeAddressCity != null)
				return false;
		} else if (!homeAddressCity.equals(other.homeAddressCity))
			return false;
		if (homeAddressPinCode != other.homeAddressPinCode)
			return false;
		if (homeAddressState == null) {
			if (other.homeAddressState != null)
				return false;
		} else if (!homeAddressState.equals(other.homeAddressState))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Address [homeAddressCity=" + homeAddressCity + ", homeAddressState=" + homeAddressState
				+ ", homeAddressPinCode=" + homeAddressPinCode + ", billingAddressCity=" + billingAddressCity
				+ ", billingAddressState=" + billingAddressState + ", billingAddressPinCode=" + billingAddressPinCode
				+ "]";
	}
	
}