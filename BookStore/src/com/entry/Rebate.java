package com.entry;

/**
 * Rebate entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Rebate implements java.io.Serializable {

	// Fields

	private Integer id;
	private Long level;
	private Long rebateRate;

	// Constructors

	/** default constructor */
	public Rebate() {
	}

	/** full constructor */
	public Rebate(Long level, Long rebateRate) {
		this.level = level;
		this.rebateRate = rebateRate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getLevel() {
		return this.level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	public Long getRebateRate() {
		return this.rebateRate;
	}

	public void setRebateRate(Long rebateRate) {
		this.rebateRate = rebateRate;
	}

}