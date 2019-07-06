package br.com.transville.freterent.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
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

	public int getNrTabela() {
		return nrTabela;
	}

	public void setNrTabela(int nrTabela) {
		this.nrTabela = nrTabela;
	}

	public String getDsTabela() {
		return dsTabela;
	}

	public void setDsTabela(String dsTabela) {
		this.dsTabela = dsTabela;
	}

	public long getTipoTabela() {
		return tipoTabela;
	}

	public void setTipoTabela(long tipoTabela) {
		this.tipoTabela = tipoTabela;
	}

	public int getCdRegiao() {
		return cdRegiao;
	}

	public void setCdRegiao(int cdRegiao) {
		this.cdRegiao = cdRegiao;
	}

	public int getFaixaPeso() {
		return faixaPeso;
	}

	public void setFaixaPeso(int faixaPeso) {
		this.faixaPeso = faixaPeso;
	}

	public double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getFreteValor() {
		return freteValor;
	}

	public void setFreteValor(double freteValor) {
		this.freteValor = freteValor;
	}

	public double getGrisMinimo() {
		return grisMinimo;
	}

	public void setGrisMinimo(double grisMinimo) {
		this.grisMinimo = grisMinimo;
	}

	public double getPedagio() {
		return pedagio;
	}

	public void setPedagio(double pedagio) {
		this.pedagio = pedagio;
	}

	public double getTas() {
		return tas;
	}

	public void setTas(double tas) {
		this.tas = tas;
	}	

}
