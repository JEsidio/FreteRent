package br.com.transville.freterent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.transville.freterent.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByNome(String nome);
}
