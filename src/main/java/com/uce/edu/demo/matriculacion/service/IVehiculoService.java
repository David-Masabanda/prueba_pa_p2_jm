package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void insertar(Vehiculo v);
	public Vehiculo buscar(String nombre);
	public void actualizar(Vehiculo v);
	public void eliminar(String nombre);

}
