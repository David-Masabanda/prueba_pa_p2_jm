package com.uce.edu.demo.matriculacion.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@Override
	public void create(Vehiculo v) {
		System.out.println("Se ha creado un nuevo vehiculo en la base: "+ v);
	}

	@Override
	public Vehiculo read(String placa) {
		//Para este caso los datos que retorna son alternos. 
		//En la practica con una base de datos seran los originales de igual forma para el propietario
		System.out.println("Buscando vehiculo en la base de placa:"+ placa);
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setPlaca(placa);
		vehiculo.setMarca("Toyota");
		vehiculo.setTipo("Liviano");
		vehiculo.setPrecio(new BigDecimal(20500));
		return vehiculo;
	}

	@Override
	public void update(Vehiculo v) {
		System.out.println("Actualizando los datos del vehiculo: "+ v);
	}

	@Override
	public void delete(String placa) {
		System.out.println("Eliminando el vehiculo de la base: "+ placa);
	}

}
