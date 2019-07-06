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



@Entity
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDtGeracao() {
		return dtGeracao;
	}

	public void setDtGeracao(Date dtGeracao) {
		this.dtGeracao = dtGeracao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public long getCdRemetente() {
		return cdRemetente;
	}

	public void setCdRemetente(long cdRemetente) {
		this.cdRemetente = cdRemetente;
	}

	public String getDsRemetente() {
		return dsRemetente;
	}

	public void setDsRemetente(String dsRemetente) {
		this.dsRemetente = dsRemetente;
	}

	public int getCdRegiao() {
		return cdRegiao;
	}

	public void setCdRegiao(int cdRegiao) {
		this.cdRegiao = cdRegiao;
	}

	public String getDsRegiao() {
		return dsRegiao;
	}

	public void setDsRegiao(String dsRegiao) {
		this.dsRegiao = dsRegiao;
	}

	public int getQtdeNotasFiscais() {
		return qtdeNotasFiscais;
	}

	public void setQtdeNotasFiscais(int qtdeNotasFiscais) {
		this.qtdeNotasFiscais = qtdeNotasFiscais;
	}

	public double getPesoCubado() {
		return pesoCubado;
	}

	public void setPesoCubado(double pesoCubado) {
		this.pesoCubado = pesoCubado;
	}

	public double getValorMercadoria() {
		return valorMercadoria;
	}

	public void setValorMercadoria(double valorMercadoria) {
		this.valorMercadoria = valorMercadoria;
	}

	public double getReceitaFrete() {
		return receitaFrete;
	}

	public void setReceitaFrete(double receitaFrete) {
		this.receitaFrete = receitaFrete;
	}

	public double getCustoTransferencia() {
		return custoTransferencia;
	}

	public void setCustoTransferencia(double custoTransferencia) {
		this.custoTransferencia = custoTransferencia;
	}

	public double getCustoColeta() {
		return custoColeta;
	}

	public void setCustoColeta(double custoColeta) {
		this.custoColeta = custoColeta;
	}

	public double getCustoEntrega() {
		return custoEntrega;
	}

	public void setCustoEntrega(double custoEntrega) {
		this.custoEntrega = custoEntrega;
	}

	public double getOutrosCustos() {
		return outrosCustos;
	}

	public void setOutrosCustos(double outrosCustos) {
		this.outrosCustos = outrosCustos;
	}

	public double getMargemContribuicao() {
		return margemContribuicao;
	}

	public void setMargemContribuicao(double margemContribuicao) {
		this.margemContribuicao = margemContribuicao;
	}

	public String getLogAlteracao() {
		return logAlteracao;
	}

	public void setLogAlteracao(String logAlteracao) {
		this.logAlteracao = logAlteracao;
	}
	

}
