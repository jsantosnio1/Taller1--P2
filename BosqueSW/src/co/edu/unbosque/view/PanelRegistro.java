package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PanelRegistro extends JPanel {
	
	
	private static final long serialVersionUID = 1L;

	private JLabel lblNombre, lblApellido1, lblSexo, lblCorreo,lblIngresos;
	private JTextField txtNombre, txtApellido1,txtCorreo,txtIngresos;

	private JPanel panelDatos, panelRadioButton;
	private JRadioButton rbtnHombre, rbtnMujer;
	private JButton btnRegistrar;
	private ViewPrincipal vp;
	
	public PanelRegistro (ViewPrincipal vP) {
		// TODO Auto-generated constructor stub
		vp = vP;

		panelDatos = new JPanel();
		panelDatos.setBackground(Color.BLACK);

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

		panelRadioButton = new JPanel();
		panelRadioButton.setLayout(new GridLayout(1,2));
		panelRadioButton.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelRadioButton.setBackground(Color.WHITE);

		rbtnHombre = new JRadioButton("Hombre", false);
		rbtnHombre.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		rbtnHombre.setForeground(Color.BLUE);
		rbtnHombre.setBackground(Color.WHITE);
		panelRadioButton.add(rbtnHombre);

		rbtnMujer = new JRadioButton("Mujer", false);
		rbtnMujer.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		rbtnMujer.setForeground(Color.PINK);
		rbtnMujer.setBackground(Color.WHITE);
		panelRadioButton.add(rbtnMujer);

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
		panelDatos.add(lblSexo);		panelDatos.add(panelRadioButton);
	
		panelDatos.add(lblCorreo);		panelDatos.add(txtCorreo);


	


	}
}
