package com.brecho.Brecho.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Produto {

	@Id @Getter
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Getter @Setter
	@Size(min = 5, max = 70, message = "minimo 5 e maximo 70")// add Message
	private String nome;

	@NotNull
	@Getter @Setter
	private double preco;

	@NotNull
	@Getter @Setter
	private double desconto;

	@NotNull
	@Getter @Setter
	@Size(min = 5, max = 300, message = "minimo 5 e max 300")
	private String descricao;


	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;	

	@NotNull @Setter @Getter
	private boolean disponivel;

}
