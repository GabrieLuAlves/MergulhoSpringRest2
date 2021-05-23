package com.gabrielluan.algalog.domain.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gabrielluan.algalog.domain.model.Entrega;
import com.gabrielluan.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {
	
	EntregaRepository entregaRepository;
	BuscaEntregaService buscaEntregaService;
	
	@Transactional
	public void finalizar(Long entregaId) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		entrega.finalizar();
		
		entregaRepository.save(entrega);
		
	}
	
}
