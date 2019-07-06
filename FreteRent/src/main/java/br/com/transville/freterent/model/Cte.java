package br.com.transville.freterent.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Cte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int cdEmpresa;
	private int cdEmpresaDestino;
	private int nrCte;
	private int nrSeqControle;
	
	//@Temporal(value=TemporalType.TIMESTAMP)
	@Temporal(value=TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dtEmissao;
	private String cnpjRemetente;
	private String dsRemetente;
	private int cepRemetente;
	private String cidadeRemetente;
	private String ufRemetente;
	private String regiaoRemetente;
	private String cnpjDestinatario;
	private String dsDestinatario;
	private int cepDestinatario;
	private String cidadeDestinatario;
	private String ufDestinatario;
	private String regiaoDestinatario;
	private double valorNotaFiscal;
	private double pesoCubado;
	private double peso;
	private int volumes;
	private double valorFrete;
	
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
	private Custos custos;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
	private ValoresTabelaCliente valoresTabelaCliente;
	
	//MUDAR PARA MANY TO MANY
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
	private Avaliacao avaliacao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(int cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public int getCdEmpresaDestino() {
		return cdEmpresaDestino;
	}

	public void setCdEmpresaDestino(int cdEmpresaDestino) {
		this.cdEmpresaDestino = cdEmpresaDestino;
	}

	public int getNrCte() {
		return nrCte;
	}

	public void setNrCte(int nrCte) {
		this.nrCte = nrCte;
	}

	public int getNrSeqControle() {
		return nrSeqControle;
	}

	public void setNrSeqControle(int nrSeqControle) {
		this.nrSeqControle = nrSeqControle;
	}

	public Date getDtEmissao() {
		return dtEmissao;
	}

	public void setDtEmissao(Date dtEmissao) {
		this.dtEmissao = dtEmissao;
	}

	public String getCnpjRemetente() {
		return cnpjRemetente;
	}

	public void setCnpjRemetente(String cnpjRemetente) {
		this.cnpjRemetente = cnpjRemetente;
	}

	public String getDsRemetente() {
		return dsRemetente;
	}

	public void setDsRemetente(String dsRemetente) {
		this.dsRemetente = dsRemetente;
	}

	public int getCepRemetente() {
		return cepRemetente;
	}

	public void setCepRemetente(int cepRemetente) {
		this.cepRemetente = cepRemetente;
	}

	public String getCidadeRemetente() {
		return cidadeRemetente;
	}

	public void setCidadeRemetente(String cidadeRemetente) {
		this.cidadeRemetente = cidadeRemetente;
	}

	public String getUfRemetente() {
		return ufRemetente;
	}

	public void setUfRemetente(String ufRemetente) {
		this.ufRemetente = ufRemetente;
	}

	public String getRegiaoRemetente() {
		return regiaoRemetente;
	}

	public void setRegiaoRemetente(String regiaoRemetente) {
		this.regiaoRemetente = regiaoRemetente;
	}

	public String getCnpjDestinatario() {
		return cnpjDestinatario;
	}

	public void setCnpjDestinatario(String cnpjDestinatario) {
		this.cnpjDestinatario = cnpjDestinatario;
	}

	public String getDsDestinatario() {
		return dsDestinatario;
	}

	public void setDsDestinatario(String dsDestinatario) {
		this.dsDestinatario = dsDestinatario;
	}

	public int getCepDestinatario() {
		return cepDestinatario;
	}

	public void setCepDestinatario(int cepDestinatario) {
		this.cepDestinatario = cepDestinatario;
	}

	public String getCidadeDestinatario() {
		return cidadeDestinatario;
	}

	public void setCidadeDestinatario(String cidadeDestinatario) {
		this.cidadeDestinatario = cidadeDestinatario;
	}

	public String getUfDestinatario() {
		return ufDestinatario;
	}

	public void setUfDestinatario(String ufDestinatario) {
		this.ufDestinatario = ufDestinatario;
	}

	public String getRegiaoDestinatario() {
		return regiaoDestinatario;
	}

	public void setRegiaoDestinatario(String regiaoDestinatario) {
		this.regiaoDestinatario = regiaoDestinatario;
	}

	public double getValorNotaFiscal() {
		return valorNotaFiscal;
	}

	public void setValorNotaFiscal(double valorNotaFiscal) {
		this.valorNotaFiscal = valorNotaFiscal;
	}

	public double getPesoCubado() {
		return pesoCubado;
	}

	public void setPesoCubado(double pesoCubado) {
		this.pesoCubado = pesoCubado;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getVolumes() {
		return volumes;
	}

	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Custos getCustos() {
		return custos;
	}

	public void setCustos(Custos custos) {
		this.custos = custos;
	}

	public ValoresTabelaCliente getValoresTabelaCliente() {
		return valoresTabelaCliente;
	}

	public void setValoresTabelaCliente(ValoresTabelaCliente valoresTabelaCliente) {
		this.valoresTabelaCliente = valoresTabelaCliente;
	}
	
	
}
