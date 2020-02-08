package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaRegistro extends JFrame implements ActionListener {
	
	
	private static final long serialVersionUID = 1L;

	private JLabel lblNombre, lblApellido1, lblSexo, lblCorreo,lblIngresos;
	private JTextField txtNombre, txtApellido1,txtCorreo,txtIngresos;
	private JRadioButton rbtnHombre, rbtnMujer;
	private JPanel panelDatos, panelBotones, panelRadioButton;
	private JButton btnRegistrar;
	private ViewPrincipal vp;
	
	public VentanaRegistro (ViewPrincipal vP) {
		// TODO Auto-generated constructor stub
		vp = vP;
		
		setTitle("Ventana Registrar");
		setBounds(1300, 100, 801, 417);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);

		panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(13,2));
		panelDatos.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelDatos.setBackground(Color.WHITE);

		panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(1,2));
		panelBotones.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelBotones.setBackground(Color.WHITE);

		lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblNombre.setForeground(Color.GREEN);

		txtNombre = new JTextField();

		lblApellido1 = new JLabel("Apellido: ");
		lblApellido1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblApellido1.setForeground(Color.GREEN);

		txtApellido1 = new JTextField();

		lblCorreo = new JLabel();
		lblCorreo.setText("Correo: ");
		lblCorreo.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblCorreo.setForeground(Color.ORANGE);

		txtCorreo = new JTextField();

		lblSexo = new JLabel();
		lblSexo.setText("Sexo: ");
		lblSexo.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblSexo.setForeground(Color.PINK);

		rbtnHombre = new JRadioButton("Hombre", false);
		rbtnHombre.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		rbtnHombre.setForeground(Color.BLUE);
		rbtnHombre.setBackground(Color.WHITE);


		rbtnMujer = new JRadioButton("Mujer", false);
		rbtnMujer.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		rbtnMujer.setForeground(Color.PINK);
		rbtnMujer.setBackground(Color.WHITE);


		ButtonGroup grupob = new ButtonGroup();
		grupob.add(rbtnHombre);
		grupob.add(rbtnMujer);

		lblIngresos = new JLabel("Salario: ");
		lblIngresos.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblIngresos.setForeground(Color.CYAN);

		txtIngresos = new JTextField();
		txtIngresos.setText(String.valueOf(0));

		

		panelDatos.add(lblNombre);		panelDatos.add(txtNombre);
		panelDatos.add(lblApellido1);	panelDatos.add(txtApellido1);
		panelDatos.add(lblSexo);		
		panelDatos.add(lblCorreo);		panelDatos.add(txtCorreo);


	


	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
