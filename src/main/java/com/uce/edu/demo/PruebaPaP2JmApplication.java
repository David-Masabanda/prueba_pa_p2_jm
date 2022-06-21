package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.service.IMatriculaService;
import com.uce.edu.demo.matriculacion.service.IPropietarioService;
import com.uce.edu.demo.matriculacion.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2JmApplication implements CommandLineRunner{
	
	@Autowired
	private IMatriculaService matriculaService;
	@Autowired
	private IPropietarioService propietarioService;
	@Autowired
	private IVehiculoService vehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2JmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		System.out.println("SISTEMA DE MATRICULACION VEHICULAR \n");
		
		System.out.println("Creo un VEHICULO y lo guardo en la base de datos");
		Vehiculo v1=new Vehiculo();
		v1.setMarca("Toyota");
		v1.setPlaca("EAA-0245");
		v1.setTipo("Liviano");
		v1.setPrecio(new BigDecimal(20500));
		this.vehiculoService.insertar(v1);
		System.out.println();
		
		System.out.println("Actualizo los datos del vehiculo");
		v1.setPlaca("GKQ-0125");
		v1.setMarca("Nissan");
		this.vehiculoService.actualizar(v1);
		System.out.println();
		
		System.out.println("Creo un PROPIETARIO y lo guardo en la base");	
		Propietario p1=new Propietario();
		p1.setNombre("David");
		p1.setApellido("Lopez");
		p1.setCedula("1719139800");
		p1.setFechaNaciemiento(LocalDateTime.of(2000, 4, 24, 8, 50, 2));
		this.propietarioService.insertar(p1);
		System.out.println();
		
		this.matriculaService.matriculacion("1719139800", "GKQ-0125");
	}

}
