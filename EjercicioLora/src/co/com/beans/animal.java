package co.com.beans;

public class animal {
	private String nombre;
	private String raza;
	
	public animal() {
		
	}
	
	public animal (String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	
	
	
	   public String getnombre() {
	        return nombre;
	    }

	    public void setnombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
		
		   public String getraza() {
		        return raza;
		    }

		    public void setraza(String raza) {
		        this.raza = raza;
		    }
}
