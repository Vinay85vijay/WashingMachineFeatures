package com.washingmachine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class TopEndFeatures {
	@Id
	@Column(name="i_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long i_id;
	private String EnergyEffeciency;
	private String larger;
	private String spin;
	private String clothingLife;
	private String cost;
	private String doorLock;
	private String washTimeCycle;
	private String reliability;
	private String lifeExpectency;
	public TopEndFeatures() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TopEndFeatures(Long i_id, String energyEffeciency, String larger, String spin, String clothingLife,
			String cost, String doorLock, String washTimeCycle, String reliability, String lifeExpectency) {
		super();
		this.i_id = i_id;
		EnergyEffeciency = energyEffeciency;
		this.larger = larger;
		this.spin = spin;
		this.clothingLife = clothingLife;
		this.cost = cost;
		this.doorLock = doorLock;
		this.washTimeCycle = washTimeCycle;
		this.reliability = reliability;
		this.lifeExpectency = lifeExpectency;
	}
	public Long getI_id() {
		return i_id;
	}
	public void setI_id(Long i_id) {
		this.i_id = i_id;
	}
	public String getEnergyEffeciency() {
		return EnergyEffeciency;
	}
	public void setEnergyEffeciency(String energyEffeciency) {
		EnergyEffeciency = energyEffeciency;
	}
	public String getLarger() {
		return larger;
	}
	public void setLarger(String larger) {
		this.larger = larger;
	}
	public String getSpin() {
		return spin;
	}
	public void setSpin(String spin) {
		this.spin = spin;
	}
	public String getClothingLife() {
		return clothingLife;
	}
	public void setClothingLife(String clothingLife) {
		this.clothingLife = clothingLife;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getDoorLock() {
		return doorLock;
	}
	public void setDoorLock(String doorLock) {
		this.doorLock = doorLock;
	}
	public String getWashTimeCycle() {
		return washTimeCycle;
	}
	public void setWashTimeCycle(String washTimeCycle) {
		this.washTimeCycle = washTimeCycle;
	}
	public String getReliability() {
		return reliability;
	}
	public void setReliability(String reliability) {
		this.reliability = reliability;
	}
	public String getLifeExpectency() {
		return lifeExpectency;
	}
	public void setLifeExpectency(String lifeExpectency) {
		this.lifeExpectency = lifeExpectency;
	}
	
}
