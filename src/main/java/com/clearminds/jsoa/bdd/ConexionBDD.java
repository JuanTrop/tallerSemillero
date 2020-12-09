package com.clearminds.jsoa.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConexionBDD {

	public static String leerPropiedad(String propiedad){
		ContenedorListaPropiedades propiedades= new ContenedorListaPropiedades();
		
		try {
			propiedades.cargar(new FileReader("conexion.properties"));
			
			//Si el argumento es nulo o vacio se leen todas las propiedaes
			String strprop =  (propiedad == null 
					|| propiedad == "" ) ?
					propiedades.leerPropiedad() : 
					propiedades.leerPropiedad(propiedad);
			
			return (strprop == null)? null : strprop;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
