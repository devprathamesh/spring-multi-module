package dev.prathamesh.data.module.dto;

public class Address extends BaseEntity {
	private static final long serialVersionUID = -3041065374712257554L;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String zipCode;
	private String state;

	public Address() {
		super();
	}

	public Address(String addressLine1, String addressLine2, String addressLine3, String zipCode, String state) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.zipCode = zipCode;
		this.state = state;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
