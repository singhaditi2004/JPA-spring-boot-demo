package com.jpa.spring_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Student {
	@Id
	private Long sId;
	private String sFName;
	private String sLName;
	private String emailId;
	private String gName;
	private String gEmail;
	private String gMob;

}
