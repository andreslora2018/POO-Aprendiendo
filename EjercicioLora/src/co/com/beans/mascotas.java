package co.com.beans;

public class mascotas extends animal {
	private String id;
	
	public mascotas(String id, String nombre, String raza) {
		this.id = id;

	}
	
	public mascotas() {
	
     }
	
	   public String getid() {
	        return id;
	    }

	    public void setid(String id) {
	        this.id = id;
	    }
}
