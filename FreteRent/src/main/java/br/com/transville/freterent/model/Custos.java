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
public class Custos {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int cdEmpresa;
	
	private String dsCusto;
	
	//@Temporal(value=TemporalType.TIMESTAMP)
	@Temporal(value=TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dtCusto;
	
	private double custoColetaEntrega;
	
	private double custoCargaDescarga;
	
	private double custoTransferencia;
	
	private double despesasOperacionais;
	
	private double matrizDespesaCusto;

	
	/*@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
	private Distancias distancias;*/
	
	
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

	public String getDsCusto() {
		return dsCusto;
	}

	public void setDsCusto(String dsCusto) {
		this.dsCusto = dsCusto;
	}
	
	public Date getDtCusto() {
		return dtCusto;
	}

	public void setDtCusto(Date dtCusto) {
		this.dtCusto = dtCusto;
	}

	public double getCustoColetaEntrega() {
		return custoColetaEntrega;
	}

	public void setCustoColetaEntrega(double custoColetaEntrega) {
		this.custoColetaEntrega = custoColetaEntrega;
	}

	public double getCustoCargaDescarga() {
		return custoCargaDescarga;
	}

	public void setCustoCargaDescarga(double custoCargaDescarga) {
		this.custoCargaDescarga = custoCargaDescarga;
	}

	public double getCustoTransferencia() {
		return custoTransferencia;
	}

	public void setCustoTransferencia(double custoTransferencia) {
		this.custoTransferencia = custoTransferencia;
	}

	public double getDespesasOperacionais() {
		return despesasOperacionais;
	}

	public void setDespesasOperacionais(double despesasOperacionais) {
		this.despesasOperacionais = despesasOperacionais;
	}

	public double getMatrizDespesaCusto() {
		return matrizDespesaCusto;
	}

	public void setMatrizDespesaCusto(double matrizDespesaCusto) {
		this.matrizDespesaCusto = matrizDespesaCusto;
	}
	
}
