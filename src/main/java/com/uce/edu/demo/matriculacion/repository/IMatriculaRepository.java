package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

public interface IMatriculaRepository {
	
	public void create(Matricula m);
	public Matricula read(String propietario);
	public void update(Matricula m);
	public void delete(String propietario);
}
