package com.jpa.spring_jpa.entity;

import jakarta.persistence.Embeddable;


@Embeddable
@Data
public class Guardian {
	private String gName;
	private String gEmail;
	private String gMob;
}
