package com.dozo.jackson.json.demo.tests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Student {

	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private boolean active;
	
	private Address address;
	
	private String[] languages;
	
	public Student() {
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean isActive() {
		return active;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", active=" + active + "]";
	}
	
	public class Address {
		private String street;
		private String city;
		private String state;
		private String zip;
		private String country;
		
		public Address() {
		}
		
		public String getStreet() {
			return street;
		}
		
		public String getCity() {
			return city;
		}
		
		public String getState() {
			return state;
		}
		
		public String getZip() {
			return zip;
		}
		
		public String getCountry() {
			return country;
		}
		
		public void setStreet(String street) {
			this.street = street;
		}
		
		public void setCity(String city) {
			this.city = city;
		}
		
		public void setState(String state) {
			this.state = state;
		}
		
		public void setZip(String zip) {
			this.zip = zip;
		}
		
		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
					+ country + "]";
		}

	}
	
}
