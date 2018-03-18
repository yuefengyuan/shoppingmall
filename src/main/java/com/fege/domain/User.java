package com.fege.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable{

	@Id
	private Long userId;

	private String userName;

	private String password;

	private Integer status;
}
