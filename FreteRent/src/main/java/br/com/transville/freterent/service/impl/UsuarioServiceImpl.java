package br.com.transville.freterent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transville.freterent.model.Usuario;
import br.com.transville.freterent.repository.UsuarioRepository;
import br.com.transville.freterent.service.UsuarioService;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public List<Usuario> getAll() {
		return repository.findAll();
	}
	
	@Override
	public void save(Usuario usuario) {
		repository.save(usuario);
	}
	
	@Override
	public void delete(Usuario usuario) {
		repository.delete(usuario);
	}

}
