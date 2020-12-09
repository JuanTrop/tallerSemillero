package com.clearminds.jsoa.servicios;

import com.clearminds.jsoa.dtos.Estudiante;
import com.clearminds.jsoa.excepciones.BDDException;

public class TestServicio {

	public static void main(String[] args) {
		ServicioEstudiante servEstudiante = new ServicioEstudiante();
		try {
			servEstudiante.insertarEstudiante(new Estudiante("Juan", "Ortiz"));
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}

}
