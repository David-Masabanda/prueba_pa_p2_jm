package com.uce.edu.demo.matriculacion.modelo;

import java.time.LocalDateTime;

public class Propietario {
	
	private String nombre;
	private String apellido;
	private String cedula;
	private LocalDateTime fechaNaciemiento;
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public LocalDateTime getFechaNaciemiento() {
		return fechaNaciemiento;
	}
	public void setFechaNaciemiento(LocalDateTime fechaNaciemiento) {
		this.fechaNaciemiento = fechaNaciemiento;
	}
	
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fechaNaciemiento="
				+ fechaNaciemiento + "]";
	}
	
	
	
}
