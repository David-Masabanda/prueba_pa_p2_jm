package com.uce.edu.demo.matriculacion.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void create(Propietario p) {
		System.out.println("Se ha creado un nuevo propietario en la base: "+ p);
	}

	@Override
	public Propietario read(String nombre) {
		System.out.println("Buscando propietario en la base de datos:"+ nombre);
		Propietario propietario=new Propietario();
		propietario.setNombre("David");
		propietario.setApellido("Lopez");
		propietario.setCedula("0123456700");
		propietario.setFechaNaciemiento(LocalDateTime.of(1999, 2, 14, 8, 50, 2));
		return propietario;
	}

	@Override
	public void update(Propietario p) {
		System.out.println("Actualizando los datos del propietario: "+ p);
	}

	@Override
	public void delete(String nombre) {
		System.out.println("Eliminando el propietario de la base: "+ nombre);
	}

}
