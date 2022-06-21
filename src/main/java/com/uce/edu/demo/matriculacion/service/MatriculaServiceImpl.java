package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IMatriculaRepository;
import com.uce.edu.demo.matriculacion.repository.IPropietarioRepository;
import com.uce.edu.demo.matriculacion.repository.IVehiculoRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Autowired
	private IPropietarioRepository propietarioRepository;
	
	@Override
	public void matriculacion(String cedula, String placa) {
		
		Propietario prop=this.propietarioRepository.read(cedula);
		Vehiculo v=this.vehiculoRepository.read(placa);
		
		BigDecimal valorMatricula;
		BigDecimal porcentaje;
		BigDecimal precio=v.getPrecio();
		
		if(v.getTipo().equals("Pesado")) {
			porcentaje=new BigDecimal(15).divide(new BigDecimal(100));
			valorMatricula=precio.multiply(porcentaje);
		}else{
			porcentaje=new BigDecimal(10).divide(new BigDecimal(100));
			valorMatricula=precio.multiply(porcentaje);
		}
		
		if(valorMatricula.intValue()>2000) {
			BigDecimal descuento=valorMatricula.multiply(new BigDecimal(0.07));
			valorMatricula=valorMatricula.subtract(descuento);
		}
		
		Matricula matricula=new Matricula();
		matricula.setFechamatricula(LocalDateTime.now());
		matricula.setValorMatricula(valorMatricula);
		matricula.setPropietario(prop);
		matricula.setVehiculo(v);
		this.matriculaRepository.create(matricula);
	}

	@Override
	public Matricula buscar(String propietario) {
		return this.matriculaRepository.read(propietario);
	}

	@Override
	public void actualizar(Matricula m) {
		this.matriculaRepository.update(m);
	}

	@Override
	public void eliminar(String propietario) {
		this.matriculaRepository.delete(propietario);
	}
	
	
}
