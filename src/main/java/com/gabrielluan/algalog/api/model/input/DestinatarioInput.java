package com.gabrielluan.algalog.api.model.input;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinatarioInput {

	@NotBlank
	String nome;
	
	@NotBlank
	String logradouro;
	
	@NotBlank
	String numero;
	
	@NotBlank
	String complemento;
	
	@NotBlank
	String bairro;
	
}
