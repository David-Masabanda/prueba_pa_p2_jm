package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

public interface IMatriculaService {
	
	public void matriculacion(String cedula, String placa);
	
	public Matricula buscar(String propietario);
	public void actualizar(Matricula m);
	public void eliminar(String propietario);
}
