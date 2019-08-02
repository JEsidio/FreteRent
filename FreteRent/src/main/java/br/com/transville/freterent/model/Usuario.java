package br.com.transville.freterent.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 500)
	private String email;
	
	private String senha;

	@NotNull()
	@NotEmpty(message = "O campo nome não pode ser em branco")
	//@Min(value = 5, message = "Deve possuir pelo menos cinco caracteres")
	@Size(min = 5, max = 10, message = "Deve possuir pelo menos cinco caracteres e no máximo 10")
	//@Pattern(regexp = )
	@Column(length = 500)
	private String nome;
	
	private String login;
	
	private long matriculaFuncionario;
	
	private String logAlteracao;
	
	//@Temporal(value=TemporalType.TIMESTAMP)
	@Temporal(value=TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dataNascimento;
	
	private String nivelUsuario;
	
	private int cdEmpresa;

	private int inAtivo;
	
	
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

	public long getMatriculaFuncionario() {
		return matriculaFuncionario;
	}

	public void setMatriculaFuncionario(long matriculaFuncionario) {
		this.matriculaFuncionario = matriculaFuncionario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogAlteracao() {
		return logAlteracao;
	}

	public void setLogAlteracao(String logAlteracao) {
		this.logAlteracao = logAlteracao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getNivelUsuario() {
		return nivelUsuario;
	}

	public void setNivelUsuario(String nivelUsuario) {
		this.nivelUsuario = nivelUsuario;
	}

	public int getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(int cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}
	
	public int getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(int inAtivo) {
		this.inAtivo = inAtivo;
	}		
	
}
