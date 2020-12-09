package com.clearminds.jsoa.servicios;

import java.sql.Statement;

import com.clearminds.jsoa.bdd.ConexionBDD;
import com.clearminds.jsoa.dtos.Estudiante;
import com.clearminds.jsoa.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		System.out.println("Insertando estudiante");
		System.out.println(estudiante);
		
		Statement stmt = null;
		
		try {
			stmt = ConexionBDD.obtenerConexion().createStatement();
			
			String sql = "insert into estudiantes (nombre, apellido) values('" + estudiante.getNombre() + "' , '" + 
			estudiante.getApellido() + "')" ;
			
			System.out.println("Script: " + sql);
			
			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void actualizarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		System.out.println("Actualizando estudiante");
		System.out.println(estudiante);
		
		Statement stmt = null;
		
		try {
			stmt = ConexionBDD.obtenerConexion().createStatement();
			
			String sql = "update estudiantes set nombre='" + estudiante.getNombre() + "', apellido='" + 
			estudiante.getApellido() + "' where id=" + estudiante.getId() ;
			
			System.out.println("Script: " + sql);
			
			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
