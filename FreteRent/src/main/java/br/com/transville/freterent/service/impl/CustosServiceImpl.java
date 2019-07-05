package br.com.transville.freterent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transville.freterent.model.Custos;
import br.com.transville.freterent.repository.CustosRepository;
import br.com.transville.freterent.service.CustosService;


@Service
public class CustosServiceImpl implements CustosService {

	@Autowired
	private CustosRepository repository;
	
	@Override
	public List<Custos> getAll() {
		return repository.findAll();
	}
	
	@Override
	public void save(Custos custos) {
		repository.save(custos);
	}
	
	@Override
	public void delete(Custos custos) {
		repository.delete(custos);
	}
	
}
