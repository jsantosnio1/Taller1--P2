package co.edu.unbosque.model;

import java.io.Serializable;

public class Personal implements Serializable {
	
		/**
	 * 
	 */
		private static final long serialVersionUID = 1L;
		private int id, telefono,anioing,salario;
	    private String nombre, apellido, correo;
		private Object sexo;

	    public Personal(int id, String nombre, String apellido, Object sexo, int telefono, String correo, int salario, 
	    		int anioing) {
	        
	    	this.id = id;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.sexo = sexo;
	        this.telefono = telefono;
	        this.correo = correo;
	   	    this.salario = salario;
	   	    this.anioing = anioing;
	   	   
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

		public int getAnioing() {
			return anioing;
		}

		public void setAnioing(int anioing) {
			this.anioing = anioing;
		}

		public int getSalario() {
			return salario;
		}

		public void setSalario(int salario) {
			this.salario = salario;
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

		public Object getSexo() {
			return sexo;
		}

		public void setSexo(Object sexo) {
			this.sexo = sexo;
		}
	    
		
		public String toString() {
	        return "Personal{" +
	                "id=" + id +
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
