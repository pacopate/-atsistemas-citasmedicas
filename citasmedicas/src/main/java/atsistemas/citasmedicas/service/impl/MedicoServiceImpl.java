package atsistemas.citasmedicas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atsistemas.citasmedicas.dao.MedicoDao;
import atsistemas.citasmedicas.model.Medico;


@Service
public class MedicoServiceImpl {

	@Autowired
	private MedicoDao medicoDao;

//	@Override
	public Medico findById(Integer id) {
		return medicoDao.findOne(id);
	}
}