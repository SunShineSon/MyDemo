package com.demo.luck;

import java.util.Date;

public class PrizePerson {

	private String id;
	private String persionId;
	private PrizeEnum type;
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPersionId() {
		return persionId;
	}

	public void setPersionId(String persionId) {
		this.persionId = persionId;
	}

	public PrizeEnum getType() {
		return type;
	}

	public void setType(PrizeEnum type) {
		this.type = type;
	}

}
