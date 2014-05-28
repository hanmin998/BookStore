package com.entry;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Bookinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Bookinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String bookname;
	private String isbn;
	private String writer;
	private String publisher;
	private String intro;
	private Long price;
	private Short remaining;
	private String picture;
	private Date date;
	private Set orders = new HashSet(0);
	private Set remarks = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bookinfo() {
	}

	/** minimal constructor */
	public Bookinfo(String bookname, String isbn, String writer,
			String publisher, Long price, Short remaining, Date date) {
		this.bookname = bookname;
		this.isbn = isbn;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.remaining = remaining;
		this.date = date;
	}

	/** full constructor */
	public Bookinfo(String bookname, String isbn, String writer,
			String publisher, String intro, Long price, Short remaining,
			String picture, Date date, Set orders, Set remarks) {
		this.bookname = bookname;
		this.isbn = isbn;
		this.writer = writer;
		this.publisher = publisher;
		this.intro = intro;
		this.price = price;
		this.remaining = remaining;
		this.picture = picture;
		this.date = date;
		this.orders = orders;
		this.remarks = remarks;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookname() {
		return this.bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Short getRemaining() {
		return this.remaining;
	}

	public void setRemaining(Short remaining) {
		this.remaining = remaining;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

	public Set getRemarks() {
		return this.remarks;
	}

	public void setRemarks(Set remarks) {
		this.remarks = remarks;
	}

}