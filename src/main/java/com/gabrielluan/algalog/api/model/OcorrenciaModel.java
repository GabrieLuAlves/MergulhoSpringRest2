package com.gabrielluan.algalog.api.model;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaModel {

	Long id;
	String descricao;
	OffsetDateTime dataRegistro;
	
}
