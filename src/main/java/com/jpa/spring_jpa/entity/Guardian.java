package com.jpa.spring_jpa.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides({ 
	@AttributeOverride(
		name ="gName",
		column = @Column(name ="g_name")	
		),
	@AttributeOverride(
			name ="gMob",
			column = @Column(name ="g_mob")	
			),
	@AttributeOverride(
			name ="gEmail",
			column = @Column(name ="g_email")	
			)
	})

public class Guardian {
	private String gName;
	private String gEmail;
	private String gMob;
}
