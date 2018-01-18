package atsistemas.citasmedicas.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import atsistemas.citasmedicas.model.Medico;

@Repository
public interface MedicoDao extends PagingAndSortingRepository <Medico, Integer> {
	
	

}
