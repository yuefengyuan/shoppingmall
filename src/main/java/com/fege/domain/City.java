package com.fege.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class City implements Serializable{

	@Id
	private Long cityId;

	@Column(nullable = false)
	private String cityName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "City{" +
				"cityId=" + cityId +
				", cityName='" + cityName + '\'' +
				'}';
	}
}
