package com.demo.luck;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author foss
 * @create time 2016年4月1日 下午5:33:05
 * @version 1.0.0
 */

@Entity
@Table(name = "person")
public class Person {

	@Column(name = "id")
	private String id;

	// prize type
	@Column(name = "type")
	private PrizeEnum type;

	// hava qualifications 资格
	private boolean qualifications;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PrizeEnum getType() {
		return type;
	}

	public void setType(PrizeEnum type) {
		this.type = type;
	}

	public boolean isQualifications() {
		return qualifications;
	}

	public void setQualifications(boolean qualifications) {
		this.qualifications = qualifications;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", type=" + type + ", qualifications="
				+ qualifications + "]";
	}

}
