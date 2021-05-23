package com.gabrielluan.algalog.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.gabrielluan.algalog.domain.model.StatusEntrega;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class EntregaModel {
	
	Long id;
	ClienteResumoModel cliente;
	DestinatarioModel destinatario;
	BigDecimal taxa;
	StatusEntrega status;
	OffsetDateTime dataPedido;
	OffsetDateTime dataFinalizacao;
	
}
