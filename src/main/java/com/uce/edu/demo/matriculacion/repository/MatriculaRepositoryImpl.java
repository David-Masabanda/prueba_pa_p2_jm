package com.uce.edu.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void create(Matricula m) {
		System.out.println("Se ha creado una nueva matricula en la base: "+ m);
	}

	@Override
	public Matricula read(String propietario) {
		System.out.println("Buscando matricula en la base del propietario: "+ propietario);
		return null;
	}

	@Override
	public void update(Matricula m) {
		System.out.println("Actualizando los datos de la matricula: "+ m);
	}

	@Override
	public void delete(String propietario) {
		System.out.println("Eliminando la matricula del propietario: "+ propietario);
	}

}
