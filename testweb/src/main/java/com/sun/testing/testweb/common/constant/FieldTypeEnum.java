package com.sun.testing.testweb.common.constant;

public enum FieldTypeEnum {
	
	TEXT("T", "text"),
	REDIO("R", "redio"),
	CHECKBOX("C", "checkbox"),
	SELECT("S", "select");
	
	private FieldTypeEnum(String code, String value) {
		this.code = code;
		this.value = value;
	}
	
	private String code;
	
	private String value;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
