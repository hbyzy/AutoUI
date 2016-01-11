package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * Tbinstrstockfile generated by hbm2java
 */
public class Tbinstrstockfile implements java.io.Serializable {

	private String serialNo;
	private BigDecimal transDate;
	private String attachType;
	private String businNo;
	private BigDecimal versionNo;
	private String creator;
	private String attachmentFilename;
	private String serverFilename;
	private String erecordNo;
	private String reserve1;
	private String reserve2;

	public Tbinstrstockfile() {
	}

	public Tbinstrstockfile(String serialNo, BigDecimal transDate,
			String attachType, String businNo, BigDecimal versionNo,
			String creator, String attachmentFilename, String serverFilename,
			String erecordNo, String reserve1, String reserve2) {
		this.serialNo = serialNo;
		this.transDate = transDate;
		this.attachType = attachType;
		this.businNo = businNo;
		this.versionNo = versionNo;
		this.creator = creator;
		this.attachmentFilename = attachmentFilename;
		this.serverFilename = serverFilename;
		this.erecordNo = erecordNo;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public BigDecimal getTransDate() {
		return this.transDate;
	}

	public void setTransDate(BigDecimal transDate) {
		this.transDate = transDate;
	}

	public String getAttachType() {
		return this.attachType;
	}

	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}

	public String getBusinNo() {
		return this.businNo;
	}

	public void setBusinNo(String businNo) {
		this.businNo = businNo;
	}

	public BigDecimal getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(BigDecimal versionNo) {
		this.versionNo = versionNo;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getAttachmentFilename() {
		return this.attachmentFilename;
	}

	public void setAttachmentFilename(String attachmentFilename) {
		this.attachmentFilename = attachmentFilename;
	}

	public String getServerFilename() {
		return this.serverFilename;
	}

	public void setServerFilename(String serverFilename) {
		this.serverFilename = serverFilename;
	}

	public String getErecordNo() {
		return this.erecordNo;
	}

	public void setErecordNo(String erecordNo) {
		this.erecordNo = erecordNo;
	}

	public String getReserve1() {
		return this.reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getReserve2() {
		return this.reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

}