package com.gabrielluan.algalog.domain.service;

import java.time.OffsetDateTime;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gabrielluan.algalog.domain.model.Cliente;
import com.gabrielluan.algalog.domain.model.Entrega;
import com.gabrielluan.algalog.domain.model.StatusEntrega;
import com.gabrielluan.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {
	
	CatalogoClienteService catalogoClienteService;
	EntregaRepository entregaRepository;

	
	@Transactional
	public Entrega solicitarEntrega(Entrega entrega) {
		Cliente cliente = catalogoClienteService.buscar(entrega.getCliente().getId());
		
		entrega.setCliente(cliente);
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(OffsetDateTime.now());
		
		return entregaRepository.save(entrega);
	}
}
