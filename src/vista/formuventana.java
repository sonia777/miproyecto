package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.PrintStream;

public class formuventana {
	private JFrame frame;
	private JTextField txtRegistrarse;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formuventana window = new formuventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public formuventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblApellido = new JLabel("apellido");
		lblApellido.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblApellido.setBounds(31, 56, 46, 14);
		frame.getContentPane().add(lblApellido);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNombre.setBackground(Color.WHITE);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setBounds(31, 31, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblEdad = new JLabel("edad");
		lblEdad.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblEdad.setBounds(31, 81, 46, 14);
		frame.getContentPane().add(lblEdad);
		
		JLabel lblSexo = new JLabel("sexo");
		lblSexo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSexo.setBounds(31, 106, 46, 15);
		frame.getContentPane().add(lblSexo);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblEmail.setBounds(31, 132, 46, 25);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblDomicilio = new JLabel("domicilio");
		lblDomicilio.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblDomicilio.setBounds(31, 168, 56, 14);
		frame.getContentPane().add(lblDomicilio);
		
		JLabel lblCiudad = new JLabel("ciudad");
		lblCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblCiudad.setBounds(31, 193, 46, 26);
		frame.getContentPane().add(lblCiudad);
		
		txtRegistrarse = new JTextField();
		txtRegistrarse.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtRegistrarse.setBackground(Color.LIGHT_GRAY);
		txtRegistrarse.setText("Registrarse");
		txtRegistrarse.setBounds(141, -3, 91, 25);
		frame.getContentPane().add(txtRegistrarse);
		txtRegistrarse.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(97, 28, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 53, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 78, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnFeminino = new JRadioButton("feminino");
		rdbtnFeminino.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnFeminino.setBounds(87, 102, 74, 23);
		frame.getContentPane().add(rdbtnFeminino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("masculino");
		rdbtnMasculino.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnMasculino.setBounds(164, 102, 91, 23);
		frame.getContentPane().add(rdbtnMasculino);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 134, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(97, 165, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(97, 196, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnEnviar.setForeground(Color.BLACK);
		btnEnviar.setBackground(Color.DARK_GRAY);
		btnEnviar.setBounds(184, 227, 71, 23);
		frame.getContentPane().add(btnEnviar);
	}
	
	
}

