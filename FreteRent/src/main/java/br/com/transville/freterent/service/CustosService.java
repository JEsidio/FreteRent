package br.com.transville.freterent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.transville.freterent.model.Custos;

@Service
public interface CustosService {
	List<Custos> getAll();
	void save(Custos custos);
	void delete(Custos custos);
}
