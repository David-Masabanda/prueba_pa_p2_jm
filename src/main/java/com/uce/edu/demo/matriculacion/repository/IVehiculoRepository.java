package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public void create(Vehiculo v);
	public Vehiculo read(String placa);
	public void update(Vehiculo v);
	public void delete(String placa);
}
