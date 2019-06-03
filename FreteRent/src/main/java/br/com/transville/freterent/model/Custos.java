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
public class Custos {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int cdEmpresa;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date dtCusto;
	
	private double custoColetaEntrega;
	
	private double custoCargaDescarga;
	
	private double custoTransferencia;
	
	private double despesasOperacionais;
	
	private double matrizDespesaCusto;

}
