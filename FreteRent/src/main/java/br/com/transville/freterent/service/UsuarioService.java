package br.com.transville.freterent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.transville.freterent.model.Usuario;

@Service
public interface UsuarioService {
	List<Usuario> getAll();
	void save(Usuario usuario);
	void delete(Usuario usuario);
	Optional<Usuario> findById(long id);
}
