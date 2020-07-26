package dev.prathamesh.data.module.dto;

public class Publisher extends BaseEntity{
	private static final long serialVersionUID = 4708715642126274414L;
	private String name;
	private Address publisherAddress;
	
	public Publisher() {
		super();
	}
	
	public Publisher(String name, Address publisherAddress) {
		super();
		this.name = name;
		this.publisherAddress = publisherAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getPublisherAddress() {
		return publisherAddress;
	}
	public void setPublisherAddress(Address publisherAddress) {
		this.publisherAddress = publisherAddress;
	}
}
