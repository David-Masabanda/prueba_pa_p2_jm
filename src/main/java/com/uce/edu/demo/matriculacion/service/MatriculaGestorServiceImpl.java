package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IMatriculaRepository;
import com.uce.edu.demo.matriculacion.repository.IPropietarioRepository;
import com.uce.edu.demo.matriculacion.repository.IVehiculoRepository;

@Service
public class MatriculaGestorServiceImpl implements IMatriculaGestorService{
	
	@Autowired
	private IPropietarioRepository propietarioRepository;
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaService matriculaPesadoService;
	@Autowired
	@Qualifier("liviano")
	private IMatriculaService matriculaLivianoService;
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	
	@Override
	public void matricular(String cedula, String placa) {
		Propietario p=this.propietarioRepository.read(cedula);
		Vehiculo v=this.vehiculoRepository.read(placa);
		
		String tipo=v.getTipo();
		BigDecimal valorMatricula;
		
		if(tipo.equals("Liviano")) {
			valorMatricula=this.matriculaLivianoService.calcular(v.getPrecio());
		}else {
			valorMatricula=this.matriculaPesadoService.calcular(v.getPrecio());
		}
		
		if(valorMatricula.compareTo(new BigDecimal(2000))>0) {
			BigDecimal descuento=valorMatricula.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
			valorMatricula=valorMatricula.subtract(descuento);
		}
		
		Matricula matricula=new Matricula();
		matricula.setFechamatricula(LocalDateTime.now());
		matricula.setValorMatricula(valorMatricula);
		matricula.setPropietario(p);
		matricula.setVehiculo(v);
		
		this.matriculaRepository.create(matricula);
		
		
	}

}
