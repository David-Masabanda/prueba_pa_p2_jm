package com.uce.edu.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository propietarioRepository;
		
	@Override
	public void insertar(Propietario p) {
		this.propietarioRepository.create(p);
	}

	@Override
	public Propietario buscar(String nombre) {
		return this.propietarioRepository.read(nombre);
	}

	@Override
	public void actualizar(Propietario p) {
		this.propietarioRepository.update(p);
	}

	@Override
	public void eliminar(String nombre) {
		this.propietarioRepository.delete(nombre);
	}

}
