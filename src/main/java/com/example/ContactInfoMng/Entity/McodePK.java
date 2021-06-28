package com.example.ContactInfoMng.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class McodePK implements Serializable {
	@Column
	private String code_cd;
	@Column
	private String code_value;
}