package com.brecho.Brecho.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Usuario {
    //atributos

	@NotNull @Getter @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	@NotNull @Getter @Setter @Size(min = 4 , max = 15,  message = "Mínimo de 4 caracteres e máximo de 15." ) private String nome;

    @NotNull @Getter @Setter @Size(min = 4 , max = 15, message = "Mínimo de 4 caracteres e máximo de 15." ) private String sobrenome;

    @NotNull @Getter @Setter private String email;

    @NotNull @Getter @Setter @Size(min = 6 , max = 12,  message = "Mínimo de 6 caracteres e máximo de 12." ) private String senha;

	  
    
}