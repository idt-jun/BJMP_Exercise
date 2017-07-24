package com.mstar.training.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Jail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToMany	(mappedBy="jails")
	private List<Officer> officers;//Many Officers report to Many Jail, assuming that there are shifting officers distributed to different jails
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "Location")
	private String location;
	
	@Column(name = "Region")
	private String region;
	
	@Column(name = "Capacity")
	private int capacity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<Officer> getOfficers() {
		return officers;
	}
	public void setOfficers(List<Officer> officers) {
		this.officers = officers;
	}
	
}
