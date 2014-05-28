package com.entry;

import java.util.Date;

/**
 * Remark entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Remark implements java.io.Serializable {

	// Fields

	private Integer id;
	private Bookinfo bookinfo;
	private Userinfo userinfo;
	private Short grade;
	private String remark;
	private Date date;

	// Constructors

	/** default constructor */
	public Remark() {
	}

	/** full constructor */
	public Remark(Bookinfo bookinfo, Userinfo userinfo, Short grade,
			String remark, Date date) {
		this.bookinfo = bookinfo;
		this.userinfo = userinfo;
		this.grade = grade;
		this.remark = remark;
		this.date = date;
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

	public Short getGrade() {
		return this.grade;
	}

	public void setGrade(Short grade) {
		this.grade = grade;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}