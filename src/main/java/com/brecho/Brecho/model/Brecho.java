package com.brecho.Brecho.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @NoArgsConstructor @AllArgsConstructor
public class Brecho {
	//Atributos
	
	@Id @Getter @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;	
	
	@NotNull @Getter @Setter @Size(min = 3 , max = 45)
		private String nome;
	
	@NotNull @Getter @Setter @Size(min = 3 , max = 45)
		private String descricao;
	
}
