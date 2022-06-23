package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("liviano")
public class MatriculaLivianoServiceImpl implements IMatriculaService{

	@Override
	public BigDecimal calcular(BigDecimal precio) {
		return precio.multiply(new BigDecimal(0.10));
	}
	

}
