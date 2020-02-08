package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;

public class ViewPrincipal extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	private Controller controlador;
	
	private VentanaRegistro pr;
	
	private JButton btnRegistro;
	
	private JPanel panelDatos,panelPrincipal;
	
	public ViewPrincipal(Controller pControlador) {
		
		controlador = pControlador;
		pr = new VentanaRegistro(this);
		
		setTitle("BosqueSW");
		setLayout(new GridLayout(5,2));
		setSize(550,550);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setBackground(Color.WHITE);
		getContentPane().add(panelPrincipal);
		
		panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(2, 1));
		panelDatos.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelDatos.setBackground(Color.WHITE);
		panelPrincipal.add(panelDatos, BorderLayout.CENTER);
		
		btnRegistro = new JButton();
		btnRegistro.setText("Registro");
		btnRegistro.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnRegistro.setForeground(Color.BLACK);
		btnRegistro.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnRegistro.setActionCommand("REGISTRO");
		btnRegistro.addActionListener(this);
		panelDatos.add(btnRegistro);
		

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if(command.equalsIgnoreCase("REGISTRO")) {
			this.hide();
			VentanaRegistro vr = new VentanaRegistro(this);
			vr.setVisible(true);
		}
		if(command.equalsIgnoreCase("CERRAR")) {

		}
	}
	

	public void imprimirMensaje(String pMensaje)
	{
		JOptionPane.showMessageDialog(this, pMensaje);
	}



}
