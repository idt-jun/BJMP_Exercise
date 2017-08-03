package com.mstar.training.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 	Your score: (YES is 1 point)
 *
 *	Has Name: YES
 *	Has Address: YES (as location)
 *	Has Type: NO
 *	Type is Enum: N/A
 *	Has Region: YES
 *	Region is Enum: YES
 *  Has Capacity: YES
 *  Has Officers: YES
 *  Correct Relationship w/ Officers: NO
 *  Has Inmates: NO
 *  Correct Relationship w/ Inmates: N/A
 *  
 *  Remarks: 
 *  1. The type of the Jail was specified in the first paragraph specifically, '...and operation of all district, city and municipal jails in the Philippines...'
 *  2. Being a Jail Officer, as depicted in pop-culture, is typically a full-time job and such an officer can only sanely work for one Jail at a time. 
 *  
 *  Final Score: 6 of 11
 *
 */

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
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Region")
	private Region region;
	
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
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
