package com.gabrielluan.algalog.api.exceptionhandler;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(Include.NON_NULL)
@Getter
@Setter
public class Problema {
	
	Integer status;
	OffsetDateTime dataHora;
	String titulo;
	List<Campo> campos;
	
	@AllArgsConstructor
	@Getter
	public static class Campo {
		
		String nome;
		String mensagem;
		
	}
}
