package atsistemas.citasmedicas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Paciente {
	
	@Id
	@GeneratedValue
	private Integer id;

	private String name;
	
	@Column(unique = true)
	private String email;
	
	 // Relación 1 paciente a n consulta
	 @OneToMany(fetch = FetchType.LAZY, mappedBy="paciente" )
	 private List<Cita>listaCitas;

}
