package com.ege.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;

import java.io.Serializable;

@Entity
public class City implements Serializable{

	@Id
	@SequenceGenerator(name = "note_generator", sequenceName = "note_sequence", initialValue = 5)
	@GeneratedValue(generator = "note_generator")
	private Long cityId;

	@Column(nullable = false)
	private String cityName;

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City{" +
				"cityId=" + cityId +
				", cityName='" + cityName + '\'' +
				'}';
	}
}
