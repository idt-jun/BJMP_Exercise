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

/**
 *	Your score: (YES is 1 point)
 *
 *	Has Jail: YES
 *	Correct Relationship w/ Jail: YES
 *	Has Type: YES
 *	Type is Enum: YES
 *	Has Name: YES
 *	Has Control Number: YES
 *	Control Number is Unique: YES
 *	Has Commitment Date: YES
 *	Commitment Date is Timestamp: NO
 *
 *	Remarks:
 *	1. The commitment date is required for budgeting meals for an inmate (breakfast, lunch & dinner), so on the commitment date itself it is important to know if the inmate has been served all 3 meals or not.
 *
 *	Final Score: 8 of 9
 */

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
	@JoinColumn(name="JAIL_ID")	//Many Inmates are detained to One Jail. Use an FK here to link the Jail table
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
