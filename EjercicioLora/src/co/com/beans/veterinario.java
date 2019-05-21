package co.com.beans;

import java.util.ArrayList;

public class veterinario{
	private String id;
	private String nombre;
	private String apellido;
	private ArrayList<mascotas> mascotas;
	
	
	public veterinario (String id, String nombre, String apellido, ArrayList<mascotas>mascotas) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mascotas = mascotas;
	}
	
	public veterinario() {
		
	}
	
	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getapellido() {
		return apellido;
	}
	
	public void setapellido(String apellido) {
		this.apellido = apellido;
	}
	
	public ArrayList<mascotas> getmascotas(){
		return mascotas;
	}
	
	public void setmascotas(ArrayList<mascotas>mascotas) {
		this.mascotas = mascotas;
	}


}

