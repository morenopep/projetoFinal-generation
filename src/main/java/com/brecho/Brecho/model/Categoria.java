package com.brecho.Brecho.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @NoArgsConstructor @AllArgsConstructor
public class Categoria {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Long id;

	@NotNull 
	@Getter @Setter
	@Size(min = 3, max = 50, message = "Mínimo de 3 caracteres e máximo de 50.")
	private String tipo;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	@Getter @Setter
	private List<Produto> produtos;	

}
