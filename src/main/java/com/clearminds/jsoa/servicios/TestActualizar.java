package com.clearminds.jsoa.servicios;

import com.clearminds.jsoa.dtos.Estudiante;
import com.clearminds.jsoa.excepciones.BDDException;

public class TestActualizar {
	public static void main(String[] args) {
		ServicioEstudiante servEstudiante = new ServicioEstudiante();
		try {
			servEstudiante.actualizarEstudiante(new Estudiante("Pedro", "Navaja", 2));
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}

}
