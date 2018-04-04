package com.cto.spring_ioc.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class City implements Serializable {

	private static final long serialVersionUID = -1463311245715506127L;
	
	private String id;
	private String name;
	private String countryCode;
	private String district;
	private String population;

}
