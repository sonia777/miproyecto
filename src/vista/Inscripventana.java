package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.SystemColor;

public class Inscripventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inscripventana window = new Inscripventana();
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
	public Inscripventana() {
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
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(53, 55, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("apellido");
		lblApellido.setBounds(53, 89, 46, 14);
		frame.getContentPane().add(lblApellido);
		
		JLabel lblEdad = new JLabel("edad");
		lblEdad.setBounds(53, 127, 46, 14);
		frame.getContentPane().add(lblEdad);
		
		JLabel lblNombreDelCurso = new JLabel("nombre del Curso");
		lblNombreDelCurso.setBounds(53, 166, 92, 14);
		frame.getContentPane().add(lblNombreDelCurso);
		
		JButton btnAceptar = new JButton("aceptar");
		btnAceptar.setBounds(303, 242, 69, 20);
		frame.getContentPane().add(btnAceptar);
		
		textField = new JTextField();
		textField.setBounds(140, 52, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(143, 86, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(143, 124, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxInstructorPersonal = new JCheckBox("Instructor Personal");
		chckbxInstructorPersonal.setBounds(143, 162, 135, 23);
		frame.getContentPane().add(chckbxInstructorPersonal);
		
		JCheckBox chckbxFitnnes_1 = new JCheckBox("Fitnnes");
		chckbxFitnnes_1.setBounds(275, 162, 97, 23);
		frame.getContentPane().add(chckbxFitnnes_1);
		
		JCheckBox chckbxAerobicLocalizada = new JCheckBox("Aerobic Localizada");
		chckbxAerobicLocalizada.setBounds(143, 191, 122, 23);
		frame.getContentPane().add(chckbxAerobicLocalizada);
		
		JCheckBox chckbxPilates = new JCheckBox("Pilates");
		chckbxPilates.setBounds(275, 188, 97, 23);
		frame.getContentPane().add(chckbxPilates);
		
		JCheckBox chckbxRunnningTeam = new JCheckBox("Runnning Team ");
		chckbxRunnningTeam.setBounds(143, 219, 122, 23);
		frame.getContentPane().add(chckbxRunnningTeam);
		
		JLabel lblInscripcion = new JLabel("INSCRIPCION");
		lblInscripcion.setForeground(SystemColor.desktop);
		lblInscripcion.setFont(new Font("Times New Roman", lblInscripcion.getFont().getStyle(), lblInscripcion.getFont().getSize() + 6));
		lblInscripcion.setBounds(163, 16, 110, 29);
		frame.getContentPane().add(lblInscripcion);
	}
}
