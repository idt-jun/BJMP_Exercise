package com.mstar.training.beans;

import static javax.persistence.TemporalType.DATE;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Inmate {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="Control_Number", unique = true)
	private int controlNumber;
	
	@Column(name="Name")
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name="Type")
	private InmateType type;
	
	@Temporal(DATE)
	@Column(name="Commitment_Date")
	private Date commitmentDate;

	@ManyToOne	
	@JoinColumn(name="JAIL_ID")	//Many Inmates are detained to One Jail. FK is the id from jail
	private Jail jail;

	@Temporal(DATE)
	@Column(name="TentativeRelease_Date")
	private Date tentativeReleasedDate;
	
	@Column(name="Budget_For_Meal")
	private int mealBudget;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(int controlNumber) {
		this.controlNumber = controlNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InmateType getType() {
		return type;
	}

	public void setType(InmateType type) {
		this.type = type;
	}

	public Date getCommitmentDate() {
		return commitmentDate;
	}

	public void setCommitmentDate(Date commitmentDate) {
		this.commitmentDate = commitmentDate;
	}

	public Jail getJail() {
		return jail;
	}

	public void setJail(Jail jail) {
		this.jail = jail;
	}

	public Date getTentativeReleasedDate() {
		return tentativeReleasedDate;
	}

	public void setTentativeReleasedDate(Date tentativeReleasedDate) {
		this.tentativeReleasedDate = tentativeReleasedDate;
	}

	public int getMealBudget() {
		return mealBudget;
	}

	public void setMealBudget(int mealBudget) {
		this.mealBudget = mealBudget;
	}
	
	
}
