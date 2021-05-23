package com.gabrielluan.algalog.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Destinatario {

	@NotBlank
	@Column(name = "destinatario_nome")
	String nome;
	
	@NotBlank
	@Column(name = "destinatario_logradouro")
	String logradouro;
	
	@NotBlank
	@Column(name = "destinatario_numero")
	String numero;
	
	@NotBlank
	@Column(name = "destinatario_complemento")
	String complemento;
	
	@NotBlank
	@Column(name = "destinatario_bairro")
	String bairro;
	
}
