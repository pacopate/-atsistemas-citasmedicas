package atsistemas.citasmedicas.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Sala {

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;
	
	@ManyToOne (fetch = FetchType.LAZY)
//	@JoinColumn(name="id_clinica") No hace falta utilizar el join porque está mapeado por el otro lado
	private Clinica clinica;
	
	// Relación 1 a n de sala a consulta
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sala")
	private List<Consulta> consultas = new ArrayList<Consulta>();
	//private ArrayList<Consulta> consultas = new ArrayList<Consulta>();
	
}
