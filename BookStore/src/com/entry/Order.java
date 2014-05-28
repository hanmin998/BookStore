package com.entry;

import java.util.Date;

/**
 * Order entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer id;
	private Bookinfo bookinfo;
	private Userinfo userinfo;
	private Short number;
	private String address;
	private String postcode;
	private Date orderdate;
	private Short status;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** full constructor */
	public Order(Bookinfo bookinfo, Userinfo userinfo, Short number,
			String address, String postcode, Date orderdate, Short status) {
		this.bookinfo = bookinfo;
		this.userinfo = userinfo;
		this.number = number;
		this.address = address;
		this.postcode = postcode;
		this.orderdate = orderdate;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Bookinfo getBookinfo() {
		return this.bookinfo;
	}

	public void setBookinfo(Bookinfo bookinfo) {
		this.bookinfo = bookinfo;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Short getNumber() {
		return this.number;
	}

	public void setNumber(Short number) {
		this.number = number;
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

	public Date getOrderdate() {
		return this.orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

}