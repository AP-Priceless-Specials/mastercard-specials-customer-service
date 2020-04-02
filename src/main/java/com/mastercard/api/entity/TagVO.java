package com.mastercard.api.entity;

import java.io.Serializable;

public class TagVO implements Serializable {

	private static final long serialVersionUID = -2674541350381022476L;
	private Long id;
    private String tag;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
}
