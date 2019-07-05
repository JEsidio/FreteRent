package br.com.transville.freterent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.transville.freterent.model.Custos;

public interface CustosRepository extends JpaRepository<Custos, Long> {
	Custos findByDsCusto(String dsCusto);
}
