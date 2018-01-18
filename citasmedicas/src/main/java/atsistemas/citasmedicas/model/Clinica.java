package atsistemas.citasmedicas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Clinica {

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;


	// Relación 1 a n de clinica a sala
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clinica")
//	private List<Sala>listaSalas;
	
//	private List<Sala>listaSalas = new Arraylist<Sala>();
	private List<Sala> salas = new ArrayList<>();

	/* Ejemplo de relaciones
	@OneToMany(fetch = FetchType.LAZY)
	private List<Book> books = new ArrayList<>();

	@OneToOne
	private Room room;
*/
}
