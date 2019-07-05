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


@Entity
public class Distancias {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int percurso;
	
	private String dsPercurso;
	
	private double distancia;
	
	private double valorKm;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPercurso() {
		return percurso;
	}

	public void setPercurso(int percurso) {
		this.percurso = percurso;
	}

	public String getDsPercurso() {
		return dsPercurso;
	}

	public void setDsPercurso(String dsPercurso) {
		this.dsPercurso = dsPercurso;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getValorKm() {
		return valorKm;
	}

	public void setValorKm(double valorKm) {
		this.valorKm = valorKm;
	}
	
}
