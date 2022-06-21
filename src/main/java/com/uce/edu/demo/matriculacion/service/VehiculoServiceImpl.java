package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService{
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Override
	public void insertar(Vehiculo v) {
		this.vehiculoRepository.create(v);
	}

	@Override
	public Vehiculo buscar(String nombre) {
		return this.vehiculoRepository.read(nombre);
	}

	@Override
	public void actualizar(Vehiculo v) {
		this.vehiculoRepository.update(v);
	}

	@Override
	public void eliminar(String nombre) {
		this.vehiculoRepository.delete(nombre);
	}


}
