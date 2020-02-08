package co.edu.unbosque.model;

import java.io.Serializable;

public class Personal implements Serializable {
	
		/**
	 * 
	 */
		private static final long serialVersionUID = 1L;
		private int id, telefono,anioing,salario;
	    private String nombre, apellido, correo ,direccion;
		private Object sexo ,ingresos;
		

	    public Personal(int id, String nombre, String apellido, Object sexo, String correo, String pDireccion, Object pIngresos) {
	        
	    	this.id =id;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.sexo = sexo;
	        this.correo = correo;
	        this.direccion = pDireccion;
	   	    this.ingresos = pIngresos;
	   
	   	   
	    }

	    
		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getApellido() {
			return apellido;
		}



		public void setApellido(String apellido) {
			this.apellido = apellido;
		}



		public String getCorreo() {
			return correo;
		}



		public void setCorreo(String correo) {
			this.correo = correo;
		}



		public String getDireccion() {
			return direccion;
		}



		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}



		public Object getSexo() {
			return sexo;
		}



		public void setSexo(Object sexo) {
			this.sexo = sexo;
		}



		public String toString() {
	        return "Personal{" +
	                ", nombre='" + nombre + '\'' +
	                ", apellido'" + apellido + '\'' +
	                ", sexo='" + sexo + '\'' +
	                 ", telefono='" + sexo + '\'' +
	                ", correo='" + correo + '\'' +
	                 ", salario='" + salario + '\'' +
	                ", anioing='" + anioing + '\'' +
	                '}';
	    }
		
    	



}
