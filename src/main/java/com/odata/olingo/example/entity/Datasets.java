package com.odata.olingo.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "odataTable21")
public class Datasets implements Serializable {
  
	@Id 
	@Column(name="id")
	private Long id;
	
	@Column(name="regn_no")
	private String regn_no;	
    
	@Column(name="regn_vfdt")
	private String regn_vfdt;
	
	@Column(name="regn_vtdt")
	private String regn_vtdt;
	
	@Column(name="maker_name")
	private String maker_name;
	
	@Column(name="model_desc")
	private String model_desc;
	
	@Column(name="body_type")
	private String body_type;
	
	@Column(name="cc")
	private String cc;
	
	@Column(name="cylinder")
	private String cylinder;
	
	@Column(name="fuel")
	private String fuel;
	
	@Column(name="hp")
	private String hp;
	
	@Column(name="seat_capacity")
	private String seat_capacity;
	
	@Column(name="apprved_dt")
	private String Apprved_Dt;
	
	@Column(name="office_id")
	private String office_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegn_no() {
		return regn_no;
	}

	public void setRegn_no(String regn_no) {
		this.regn_no = regn_no;
	}

	public String getRegn_vfdt() {
		return regn_vfdt;
	}

	public void setRegn_vfdt(String regn_vfdt) {
		this.regn_vfdt = regn_vfdt;
	}

	public String getRegn_vtdt() {
		return regn_vtdt;
	}

	public void setRegn_vtdt(String regn_vtdt) {
		this.regn_vtdt = regn_vtdt;
	}

	public String getMaker_name() {
		return maker_name;
	}

	public void setMaker_name(String maker_name) {
		this.maker_name = maker_name;
	}

	public String getModel_desc() {
		return model_desc;
	}

	public void setModel_desc(String model_desc) {
		this.model_desc = model_desc;
	}

	public String getBody_type() {
		return body_type;
	}

	public void setBody_type(String body_type) {
		this.body_type = body_type;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getCylinder() {
		return cylinder;
	}

	public void setCylinder(String cylinder) {
		this.cylinder = cylinder;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSeat_capacity() {
		return seat_capacity;
	}

	public void setSeat_capacity(String seat_capacity) {
		this.seat_capacity = seat_capacity;
	}

	public String getApprved_Dt() {
		return Apprved_Dt;
	}

	public void setApprved_Dt(String apprved_Dt) {
		Apprved_Dt = apprved_Dt;
	}

	public String getOffice_id() {
		return office_id;
	}

	public void setOffice_id(String office_id) {
		this.office_id = office_id;
	}
	
	
	
}
