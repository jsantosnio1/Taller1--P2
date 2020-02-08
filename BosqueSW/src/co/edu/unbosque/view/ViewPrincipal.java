package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

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
	
	private JButton btnRegistro,btnArchivo;
	
	private JPanel panelDatos,panelPrincipal;
	
	public ViewPrincipal(Controller pControlador) {
		
		controlador = pControlador;
		pr = new VentanaRegistro(this);
		
		setTitle("BosqueSW");
		setLayout(new GridLayout(2,2));
		setSize(350,250);
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
		
		btnArchivo = new JButton();
		btnArchivo.setText("Archivo");
		btnArchivo.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnArchivo.setForeground(Color.BLACK);
		btnArchivo.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnArchivo.setActionCommand("Archivo");
		btnArchivo.addActionListener(this);
		panelDatos.add(btnArchivo);
		
		

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if(command.equalsIgnoreCase("REGISTRO")) {
			this.hide();
			VentanaRegistro vr = new VentanaRegistro(this);
			vr.setVisible(true);
		}
		if(command.equalsIgnoreCase("ARCHIVO")) {
		
		}
	}
	

	public void registroPersona(int pId, String pNombre, String pApellido1, Object pSexo,String pCorreo, String pDireccion, Object pIngresos) {
		
		
			controlador.escribirEmpleado(pId, pNombre, pApellido1, pSexo, pCorreo, pDireccion, pIngresos);
		
	}

	public void enviarCorreo(String pCorreo) {
	    controlador.enviarCorreo(pCorreo);
    }
	
	public void CalcularSalario(int antiguedad) {
		controlador.calcularSalario(antiguedad);
	}
	


}
