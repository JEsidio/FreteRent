package br.com.transville.freterent.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class Avaliacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date dtGeracao;
	
	//optional = true é para deixar criar avaliacao sem usuario; false obriga a ter usuario na avaliação
	//@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = true)
	
	//fetch eager para sempre trazer o filho e pai
	//@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false, fetch = FetchType.EAGER) 
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
	private Usuario usuario;
	
	private long cdRemetente;
	
	private String dsRemetente;
	
	private int cdRegiao;
	
	private String dsRegiao;
	
	private int qtdeNotasFiscais;
	
	private double pesoCubado;
	
	private double valorMercadoria;
	
	private double receitaFrete;
	
	private double custoTransferencia;
	
	private double custoColeta;
	
	private double custoEntrega;
	
	private double outrosCustos;
	
	private double margemContribuicao;
	
	private String logAlteracao;
	

}
