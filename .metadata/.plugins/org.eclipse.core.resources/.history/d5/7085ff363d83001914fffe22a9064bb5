package br.com.transville.freterent.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 500)
	private String email;
	
	private String senha;

	@Column(length = 500)
	private String nome;
	
	private long cdFuncionario;
	
	private String usuario;
	
	private String logAlteracao;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date nascimento;
	
	private int nivelUsuario;
	
	private String dsNivelUsuario;
	
	private int cdEmpresa;
	
	//private int inAtivo;
	

	
}
