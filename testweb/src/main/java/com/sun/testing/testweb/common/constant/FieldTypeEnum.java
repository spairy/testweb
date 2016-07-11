package com.sun.testing.testweb.common.constant;

public enum FieldTypeEnum {
	
	UNKNOW("U", "unknow"),
	TEXT("T", "text"),
	REDIO("R", "redio"),
	CHECKBOX("C", "checkbox"),
	SELECT("S", "select"),
	BUTTON("B", "button"),
	LINK("L", "link");
	
	private FieldTypeEnum(String code, String value) {
		this.code = code;
		this.value = value;
	}
	
	private String code;
	
	private String value;

	public String getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}
	
	public static FieldTypeEnum getFieldTypeEnum(String code) {
		for (FieldTypeEnum fieldTypeEnum : FieldTypeEnum.values()) {
			if (fieldTypeEnum.getCode().equals(code)) {
				return fieldTypeEnum;
			}
		}
		return UNKNOW;
	}
}
