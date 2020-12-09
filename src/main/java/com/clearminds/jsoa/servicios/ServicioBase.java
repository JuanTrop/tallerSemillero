package com.clearminds.jsoa.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.jsoa.bdd.ConexionBDD;
import com.clearminds.jsoa.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion;
	
	public void abrirConexion() throws BDDException{
		
		this.conexion = ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion(){
		try {
			this.conexion.close();
			System.out.println("Conexion cerrada");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al cerrar conexión");
		}
		
	}
}
