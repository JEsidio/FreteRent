package br.com.transville.freterent.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ValoresTabelaCliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int cdEmpresa;
	
	private int nrTabela;
	
	private String dsTabela;
	
	private long tipoTabela;
	
	private int cdRegiao;
	
	private int faixaPeso;
	
	private double valorMinimo;
	
	private double taxa;
	
	private double freteValor;
	
	private double grisMinimo;
	
	private double pedagio;
	
	private double tas;	

}
