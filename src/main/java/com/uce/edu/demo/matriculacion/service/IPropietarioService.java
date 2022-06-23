package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioService {
	
	public void insertar(Propietario p);
	public Propietario buscar(String cedula);
	public void actualizar(Propietario p);
	public void eliminar(String cedula);
}
