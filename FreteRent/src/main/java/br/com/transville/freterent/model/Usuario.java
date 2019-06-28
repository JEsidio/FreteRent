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

import org.springframework.format.annotation.DateTimeFormat;
/*
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
*/

@Entity
/*
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
*/
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
	
	//@Temporal(value=TemporalType.TIMESTAMP)
	@Temporal(value=TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date nascimento;
	
	private int nivelUsuario;
	
	private String dsNivelUsuario;
	
	private int cdEmpresa;

	//private int inAtivo;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCdFuncionario() {
		return cdFuncionario;
	}

	public void setCdFuncionario(long cdFuncionario) {
		this.cdFuncionario = cdFuncionario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getLogAlteracao() {
		return logAlteracao;
	}

	public void setLogAlteracao(String logAlteracao) {
		this.logAlteracao = logAlteracao;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public int getNivelUsuario() {
		return nivelUsuario;
	}

	public void setNivelUsuario(int nivelUsuario) {
		this.nivelUsuario = nivelUsuario;
	}

	public String getDsNivelUsuario() {
		return dsNivelUsuario;
	}

	public void setDsNivelUsuario(String dsNivelUsuario) {
		this.dsNivelUsuario = dsNivelUsuario;
	}

	public int getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(int cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}
		
}
