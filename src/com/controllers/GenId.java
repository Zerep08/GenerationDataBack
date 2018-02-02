package com.controllers;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class GenId {

	@NotNull(message="Es requerido")
	@Min(value=0, message="Debe ser minimo 0 o mayor")
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

}
