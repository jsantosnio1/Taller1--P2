package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class VentanaRegistro extends JFrame implements ActionListener {
	
	
	private static final long serialVersionUID = 1L;
	
	private ViewPrincipal vp;
	private JLabel lblId, lblNombre, lblApellido1, lblSexo, lblCorreo,lblIngresos,lblDireccion,lblPersonal,lblIngeniero
	,lblJunior,lblSenior;
	
	private JTextField txtId, txtNombre, txtApellido1,txtCorreo,txtDireccion,txtSexo,txtAños;
	private JRadioButton rbtnSalario,rbtnComision,rbtnIngeniero,rbtnIngenieroS;
	private JPanel panelDatos, panelBotones, panelRadioButton,panelRadioButton2;
	private JButton btnRegistrar ,btnVolver;
	private JComboBox<String> lists,listi,listj,listse;
	
	
	
	public VentanaRegistro (ViewPrincipal vP) {
		// TODO Auto-generated constructor stub
		vp = vP;
		
		setTitle("Ventana Registrar");
		setBounds(1300, 100, 801, 417);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);

		panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(12,2));
		panelDatos.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelDatos.setBackground(Color.WHITE);

		panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(1,2));
		panelBotones.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelBotones.setBackground(Color.WHITE);
		
		lblId = new JLabel("Cédula:");
		lblId.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblId.setForeground(Color.RED);

		txtId = new JTextField();

		lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblNombre.setForeground(Color.BLACK);

		txtNombre = new JTextField();

		lblApellido1 = new JLabel("Apellido: ");
		lblApellido1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblApellido1.setForeground(Color.BLACK);

		txtApellido1 = new JTextField();

		lblCorreo = new JLabel();
		lblCorreo.setText("Correo: ");
		lblCorreo.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblCorreo.setForeground(Color.BLACK);

		txtCorreo = new JTextField();

		lblSexo = new JLabel();
		lblSexo.setText("Genero: ");
		lblSexo.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblSexo.setForeground(Color.BLACK);
		
		String[] listgenero = {"SELECCIONAR", "Hombre", "Mujer"};
		lists = new JComboBox<String>(listgenero);
		

		lblDireccion = new JLabel();
		lblDireccion.setText("Direccion: ");
		lblDireccion.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblDireccion.setForeground(Color.BLACK);

		txtDireccion = new JTextField();
		
		lblIngresos = new JLabel();
		lblIngresos.setText("Años: ");
		lblIngresos.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblIngresos.setForeground(Color.BLACK);

		String[] listing = {"SELECCIONAR", "Menos de dos años", "de 2 a 3 años", "de 4 a 7 años", "de 8 a 15 años", "Mas de 15 años"};
		listi = new JComboBox<String>(listing);
		
		lblPersonal = new JLabel();
		lblPersonal.setText("Tipo de Personal: ");
		lblPersonal.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblPersonal.setForeground(Color.BLACK);
		
		panelRadioButton = new JPanel();
		panelRadioButton.setLayout(new GridLayout(1,2));
		panelRadioButton.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelRadioButton.setBackground(Color.WHITE);
		

		rbtnSalario = new JRadioButton("Personal con salario fijo", false);
		rbtnSalario.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		rbtnSalario.setForeground(Color.BLACK);
		rbtnSalario.setBackground(Color.WHITE);
		panelRadioButton.add(rbtnSalario);

		rbtnComision = new JRadioButton("Personal a comision", false);
		rbtnComision.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		rbtnComision.setForeground(Color.BLACK);
		rbtnComision.setBackground(Color.WHITE);
		panelRadioButton.add(rbtnComision);

		ButtonGroup grupob = new ButtonGroup();
		grupob.add(rbtnSalario);
		grupob.add(rbtnComision);
		
		lblIngeniero = new JLabel();
		lblIngeniero.setText("Tipo de Ingeniero: ");
		lblIngeniero.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblIngeniero.setForeground(Color.BLACK);
		
		panelRadioButton2 = new JPanel();
		panelRadioButton2.setLayout(new GridLayout(1,2));
		panelRadioButton2.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelRadioButton2.setBackground(Color.WHITE);

		rbtnIngeniero = new JRadioButton("Ingeniero Junior", false);
		rbtnIngeniero.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		rbtnIngeniero.setForeground(Color.BLACK);
		rbtnIngeniero.setBackground(Color.WHITE);
		panelRadioButton2.add(rbtnIngeniero);

		rbtnIngenieroS = new JRadioButton("Ingeniero Senior", false);
		rbtnIngenieroS.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		rbtnIngenieroS.setForeground(Color.BLACK);
		rbtnIngenieroS.setBackground(Color.WHITE);
		panelRadioButton2.add(rbtnIngenieroS);

		ButtonGroup grupoc = new ButtonGroup();
		grupoc.add(rbtnIngeniero);
		grupoc.add(rbtnIngenieroS);

		lblJunior = new JLabel();
		lblJunior.setText("Nivel de Ingeniero Junior: ");
		lblJunior.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblJunior.setForeground(Color.BLACK);
		
		String[] listjunior = {"SELECCIONAR", "Nivel 1", "Nivel 2", "Nivel 3", "Nivel 4", "Nivel 5"};
		listj = new JComboBox<String>(listjunior);
		
		lblSenior = new JLabel();
		lblSenior.setText("Numero de Ventas Ingeniero Senior: ");
		lblSenior.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblSenior.setForeground(Color.BLACK);
		
		String[] listsenior = {"SELECCIONAR", "De 1 a 5 ventas", "De 6 a 10 ventas", "De 10 a 20 ventas", "Más de 21 ventas"};
		listse = new JComboBox<String>(listsenior);


		btnRegistrar = new JButton("Registrarse");
		btnRegistrar.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setBackground(Color.WHITE);
		btnRegistrar.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnRegistrar.setActionCommand("REGISTRARSE");
		btnRegistrar.addActionListener(this);

		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setBackground(Color.WHITE);
		btnVolver.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnVolver.setActionCommand("VOLVER");
		btnVolver.addActionListener(this);
		
		panelDatos.add(lblId);			panelDatos.add(txtId);
		panelDatos.add(lblNombre);		panelDatos.add(txtNombre);
		panelDatos.add(lblApellido1);	panelDatos.add(txtApellido1);
		panelDatos.add(lblSexo);		panelDatos.add(lists);
		panelDatos.add(lblCorreo);		panelDatos.add(txtCorreo);
		panelDatos.add(lblDireccion);	panelDatos.add(txtDireccion);
		panelDatos.add(lblIngresos);	panelDatos.add(listi);
		panelDatos.add(lblPersonal);	panelDatos.add(panelRadioButton);
		panelDatos.add(lblIngeniero);	panelDatos.add(panelRadioButton2);
		panelDatos.add(lblJunior);	    panelDatos.add(listj);
		panelDatos.add(lblSenior);	    panelDatos.add(listse);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(panelDatos, BorderLayout.CENTER);
		getContentPane().add(panelBotones, BorderLayout.SOUTH);
		panelBotones.add(btnVolver);
		panelBotones.add(btnRegistrar);
		
		
		rbtnSalario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				lblIngeniero.setVisible(true);
				rbtnIngeniero.setVisible(true);
				rbtnIngenieroS.setVisible(true);
				lblJunior.setVisible(true);
				listj.setVisible(true);
				lblSenior.setVisible(true);
				listse.setVisible(true);
			}
		});
		
		rbtnComision.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				lblIngeniero.setVisible(false);
				rbtnIngeniero.setVisible(false);
				rbtnIngenieroS.setVisible(false);
				lblJunior.setVisible(false);
				listj.setVisible(false);
				lblSenior.setVisible(false);
				listse.setVisible(false);
			}
		});
		
		rbtnIngeniero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				lblJunior.setVisible(true);
				listj.setVisible(true);
				lblSenior.setVisible(false);
				listse.setVisible(false);
			}
		});
		
		rbtnIngenieroS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				lblJunior.setVisible(false);
				listj.setVisible(false);
				lblSenior.setVisible(true);
				listse.setVisible(true);
				
			}
		});
		
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando= e.getActionCommand();
		if(comando.equals("REGISTRARSE")){
			if (rbtnComision.isSelected() && !txtId.getText().isEmpty() && !txtNombre.getText().isEmpty() 
					&& !txtApellido1.getText().isEmpty() && !txtCorreo.getText().isEmpty() && !txtDireccion.getText().isEmpty()
					&& lists.getSelectedIndex()>=1 && listi.getSelectedIndex()>=1) {
				
				vp.enviarCorreo(txtCorreo.getText());
				JOptionPane.showMessageDialog(null, "Registrado Exitosamente");
			}
			
			else if (rbtnSalario.isSelected() && rbtnIngeniero.isSelected() && listj.getSelectedIndex()>=1 && !txtId.getText().isEmpty() && !txtNombre.getText().isEmpty() 
					&& !txtApellido1.getText().isEmpty() && !txtCorreo.getText().isEmpty() && !txtDireccion.getText().isEmpty()
					&& lists.getSelectedIndex()>=1 && listi.getSelectedIndex()>=1)
			{
				vp.enviarCorreo(txtCorreo.getText());
				JOptionPane.showMessageDialog(null, "Registrado Exitosamente");
			}
			else if (rbtnSalario.isSelected() && rbtnIngenieroS.isSelected() && listse.getSelectedIndex()>=1 && !txtId.getText().isEmpty() && !txtNombre.getText().isEmpty() 
					&& !txtApellido1.getText().isEmpty() && !txtCorreo.getText().isEmpty() && !txtDireccion.getText().isEmpty()
					&& lists.getSelectedIndex()>=1 && listi.getSelectedIndex()>=1)
			{
				vp.enviarCorreo(txtCorreo.getText());
				JOptionPane.showMessageDialog(null, "Registrado Exitosamente");
			} 
			
			else {
					
				JOptionPane.showMessageDialog(null, "Datos Incompletos");
			}
		
			}
	
		if(comando.equals("VOLVER")){
			vp.show();
			hide();
		}
	}
}
