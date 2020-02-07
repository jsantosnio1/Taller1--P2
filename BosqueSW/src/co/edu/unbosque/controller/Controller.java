package co.edu.unbosque.controller;

import co.edu.unbosque.model.BosqueSw;
import co.edu.unbosque.view.ViewPrincipal;

public class Controller {
	
	private BosqueSw modelo;
	private ViewPrincipal vista;
	
	
	public Controller() 
	{
		modelo = new BosqueSw();
		vista = new ViewPrincipal(this);
	}

}
