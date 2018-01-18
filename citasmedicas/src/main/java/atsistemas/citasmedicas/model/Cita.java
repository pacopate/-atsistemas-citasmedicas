package atsistemas.citasmedicas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cita {

	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne (fetch = FetchType.LAZY)
	private Paciente paciente;
	
	@ManyToOne (fetch = FetchType.LAZY)
	private Consulta consulta;
	
	@GeneratedValue (/*Mirar estrategia*/)
	Integer orden;
	
}
