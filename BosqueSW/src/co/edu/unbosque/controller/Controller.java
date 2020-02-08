package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.ViewPrincipal;

public class Controller {
	
	private ViewPrincipal vista;
	
	public double salario = 3500000;
	
	
	public Controller() 
	{
		vista = new ViewPrincipal(this);
	}
	
	 public void enviarCorreo(String pCorreo) {

	        if ((pCorreo.contains("@gmail.com")) || (pCorreo.contains("@hotmail.com"))) {
	            JOptionPane.showMessageDialog(null, "El correo "+pCorreo+" ha sido verificado con el usuario ");
	        }else {
	            JOptionPane.showMessageDialog(null, "El correo ingresado no es valido");
	        }
	    }
	 
	 public double calcularSalario(int antiguedad) {
		 
		 
		 if (antiguedad == 2) salario = salario+(salario*0.05) ;
		 
		 if (antiguedad == 3) salario = salario+(salario*0.1) ;
		 
		 if (antiguedad == 4) salario = salario+(salario*0.15) ;
		 
		 if (antiguedad == 5) salario = salario+(salario*0.20) ;

		 return salario;
			 
		}
	 
	 	public double calcularVentas(int numeroventas) {
		 
		
		 
		 if (numeroventas == 1) salario = salario+(salario*0.1) ;
		 
		 if (numeroventas == 2) salario = salario+(salario*0.15) ;
		 
		 if (numeroventas == 3) salario = salario+(salario*0.20) ;
		 
		 if (numeroventas == 4) salario = salario+(salario*0.30) ;

		 return salario;
			 
		}
	 
	 	public double calcularNivel(int nivel) {
			 	
			 
			 if (nivel == 2 || nivel == 3) salario = salario+(salario*0.05) ;
			 
			 if (nivel == 4 || nivel == 5) salario = salario+(salario*0.20) ;
			 
			 return salario;
				 
			}
	 	
	 
		

}



