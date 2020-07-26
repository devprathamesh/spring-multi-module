package dev.prathamesh.data.module.dto;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 3565255116953129775L;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
