package com.clearminds.jsoa.bdd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ContenedorListaPropiedades {

	private ArrayList<Propiedad> listaPropiedades;

	public ContenedorListaPropiedades() {
		listaPropiedades = new ArrayList<Propiedad>();
	}

	public void cargar(FileReader fr){
		
		BufferedReader b = new BufferedReader(fr);
		
		try {
		String linea;
		while((linea = b.readLine()) != null){
			String[] propiedad = linea.split(":",2);
			listaPropiedades.add(new Propiedad(propiedad[0], propiedad[1]));
		}
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public String leerPropiedad(String clave) {
		Propiedad temp = null;
		
		for(int i = 0; i < listaPropiedades.size(); i++){
			temp = listaPropiedades.get(i);
			
			if(temp.getClave().equalsIgnoreCase(clave)){
				return temp.getValor();
			}
		}
		
		return null;
	}
	
	private boolean esVacio(){
		return listaPropiedades.size() > 0;
	}
	
	
	public String leerPropiedad(){
		
		String capturar = null;
		
		if(!esVacio()) {
			for(int i = 0; i < listaPropiedades.size(); i++){
			capturar = capturar + "Propiedades: \n" + "Clave: " + listaPropiedades.get(i).getClave()
					   			+ "Valor: " + listaPropiedades.get(i).getValor()
								+ "\n ";
			}
			return capturar;
		}
		return capturar;
	}
}
