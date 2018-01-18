package atsistemas.citasmedicas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "medico")
@Getter
@Setter
public class Medico {
	

		@Id
		@GeneratedValue
		private Integer id;

		private String name;
		
		@Column(unique = true)
		private String email;
		
		 
 // 	Relación 1 a n de medico a consulta
  		 @OneToMany(fetch = FetchType.LAZY, mappedBy="medico" )
		 private List<Consulta>listaConsultas;
		

}



