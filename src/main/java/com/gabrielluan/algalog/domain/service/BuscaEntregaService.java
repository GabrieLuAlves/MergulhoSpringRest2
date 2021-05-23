package com.gabrielluan.algalog.domain.service;

import org.springframework.stereotype.Service;

import com.gabrielluan.algalog.domain.exception.EntidadeNaoEncotradaException;
import com.gabrielluan.algalog.domain.model.Entrega;
import com.gabrielluan.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncotradaException("Entrega não encontrada"));
	}
}
