package com.entry;

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String pwd;
	private String email;
	private String address;
	private String postcode;
	private Long level;
	private Short power;
	private Set remarks = new HashSet(0);
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(String username, String pwd, String email) {
		this.username = username;
		this.pwd = pwd;
		this.email = email;
	}

	/** full constructor */
	public Userinfo(String username, String pwd, String email, String address,
			String postcode, Long level, Short power, Set remarks, Set orders) {
		this.username = username;
		this.pwd = pwd;
		this.email = email;
		this.address = address;
		this.postcode = postcode;
		this.level = level;
		this.power = power;
		this.remarks = remarks;
		this.orders = orders;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Long getLevel() {
		return this.level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	public Short getPower() {
		return this.power;
	}

	public void setPower(Short power) {
		this.power = power;
	}

	public Set getRemarks() {
		return this.remarks;
	}

	public void setRemarks(Set remarks) {
		this.remarks = remarks;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}