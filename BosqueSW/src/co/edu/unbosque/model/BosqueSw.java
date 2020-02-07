package co.edu.unbosque.model;

import java.util.ArrayList;

public class BosqueSw {
	
	private int numeropc;
	
	private int numeropsf;
	
	private ArrayList<Personal> Personal;
	
	private Personal personal;
	
	public void agregar(String nombre, String apellido, Object sexo, int telefono, String correo, int salario, 
    		int anioing ,TipoPersonal tipo)
	{
		personal = new Personal(nombre, apellido, sexo,telefono,correo,salario,anioing,tipo);
		
		if(tipo ==TipoPersonal.SalarioFijo)
			
		{
			numeropsf++;
		}
		
		else
		{
			numeropc++;
		}
	}
	
}
