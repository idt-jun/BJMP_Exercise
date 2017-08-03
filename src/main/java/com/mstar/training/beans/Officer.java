package com.mstar.training.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *	Your score: (YES is 1 point)
 *
 *	Has Name: YES
 *	Has Jail: YES
 *	Correct Relationship w/ Jail: NO
 *	Has Rank: YES
 *	Has Trustee: YES
 *	Correct Relationship w/ Trustee: YES
 *
 *	Remarks:
 *	1. Being a Jail Officer, as depicted in pop-culture, is typically a full-time job and such an officer can only sanely work for one Jail at a time.
 *
 *	Final Score: 5 of 6
 */

@Entity
public class Officer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name = "Rank")
	private String rank;
	
	@ManyToMany	
	private List<Jail> jails;//Many Officers report to Many Jail, assuming that there are shifting officers distributed to different jails
	
	@OneToOne
	@JoinColumn(name = "Trustee_id")
	private Trustee trustee;
	
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
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public List<Jail> getJails() {
		return jails;
	}
	public void setJails(List<Jail> jails) {
		this.jails = jails;
	}
	
	
}
