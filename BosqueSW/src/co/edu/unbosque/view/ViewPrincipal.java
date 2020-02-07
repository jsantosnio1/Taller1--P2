package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;

public class ViewPrincipal extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	public final static String INGRESAR = "ingresar";
	
	private Controller controlador;
	
	private PanelRegistro pr;
	
	public ViewPrincipal(Controller pControlador) {
		
		controlador = pControlador;
		
		setTitle("BosqueSW");
		setLayout(new GridLayout(5,2));
		setSize(550,550);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	
		pr = new PanelRegistro(this);
		add(pr, BorderLayout.NORTH);
		

		
	}
	

	public void imprimirMensaje(String pMensaje)
	{
		JOptionPane.showMessageDialog(this, pMensaje);
	}


	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
	}

}
