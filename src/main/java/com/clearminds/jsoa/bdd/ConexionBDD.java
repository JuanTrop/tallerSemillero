package com.clearminds.jsoa.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.clearminds.jsoa.excepciones.BDDException;

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
	
	public static Connection obtenerConexion () throws BDDException{
		String urlConexion, usuario, password, credenciales;
		
		//credenciales = ";" + url + usuario + ";" + password + ";";
		
		Connection connection = null;
		try {
			ContenedorListaPropiedades propiedades= new ContenedorListaPropiedades();
			propiedades.cargar(new FileReader("conexion.properties"));
			urlConexion = propiedades.leerPropiedad("urlConexion");
			usuario = propiedades.leerPropiedad("usuario");
			password = propiedades.leerPropiedad("password");
			connection = DriverManager.getConnection(urlConexion,usuario,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}
		
		return connection;
	}
	
	//public static 
}
