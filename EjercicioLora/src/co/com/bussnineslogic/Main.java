package co.com.bussnineslogic;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import co.com.beans.mascotas;
import co.com.beans.veterinario;

public class Main {
	public static void main(String[] args) {
					
		
					//creamos las mascotas
					mascotas luna = new mascotas();
					//Ponemos el nombre de la mascota y ponemos el set porque vamos a mostrar
					//Luego heredamos de la clase animal
					luna.setnombre("luna");
					luna.setraza("pitbull");
					
					//creamos otra mascota
					mascotas toby = new mascotas();
					//Ponemos el nombre de la mascota y ponemos el set porque vamos a mostrar
					//Luego heredamos de la clase animal
					toby.setnombre("toby");
					toby.setraza("felino");
					
					
					//ArrayList del mascotas
					ArrayList<mascotas> mascotas = new ArrayList<mascotas>();
					mascotas.add(luna);
					mascotas.add(toby);
					
					//creamos veterinario
					veterinario andres = new veterinario ("01","andres","lora",mascotas);
					
					
					JOptionPane.showMessageDialog(null, andres.getmascotas().get(0).getnombre());
									
					
	}
}
