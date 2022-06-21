package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {
	
	public void create(Propietario p);
	public Propietario read(String nombre);
	public void update(Propietario p);
	public void delete(String nombre);
	
}
