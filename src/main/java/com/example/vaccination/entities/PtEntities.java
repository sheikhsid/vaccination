package com.example.vaccination.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class PtEntities 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ptName;
	@Column(updatable = false,unique = true)
	private String ptFiscalCode;
	private String ptVaccsionationName;

}
