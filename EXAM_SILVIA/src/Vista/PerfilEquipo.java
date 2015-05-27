package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Modelo.Cadete;
import Modelo.IngresoLaby;

public class PerfilEquipo extends JPanel {

	private JLabel lblfoto, lblNombre, lblId,lbl1Apellido, lbl2Apellido, lblEdad, lblNacionalidad; 
	private JTextField textNombre, textId, textApellidos, textEdad, textNacionalidad;
	private JButton btnSiguiente, btnAtrs;
	private JComboBox boxEquipo;
	/**
	 * Create the panel.
	 */
	public PerfilEquipo(JPanel perfil,Cadete datosusuarios) {
		
		setLayout(null);
		
		boxEquipo = new JComboBox();
		boxEquipo.setBounds(10, 62, 144, 20);
		add(boxEquipo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(171, 37, 46, 14);
		add(lblNombre);
		
		lblId = new JLabel("Id");
		lblId.setBounds(317, 37, 46, 14);
		add(lblId);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setBounds(171, 62, 130, 20);
		add(textNombre);
		textNombre.setColumns(10);
		
		textId = new JTextField();
		textId.setEditable(false);
		textId.setBounds(317, 62, 76, 20);
		add(textId);
		textId.setColumns(10);
		
		lbl1Apellido = new JLabel("1er Apellido");
		lbl1Apellido.setBounds(171, 104, 99, 14);
		add(lbl1Apellido);
		
		textApellidos = new JTextField();
		textApellidos.setEditable(false);
		textApellidos.setBounds(171, 130, 192, 20);
		add(textApellidos);
		textApellidos.setColumns(10);
		
		lbl2Apellido = new JLabel("2\u00BA Apellido");
		lbl2Apellido.setBounds(171, 175, 81, 14);
		add(lbl2Apellido);
		
		textEdad = new JTextField();
		textEdad.setEditable(false);
		textEdad.setBounds(171, 200, 192, 20);
		add(textEdad);
		textEdad.setColumns(10);
		
		lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(171, 243, 99, 14);
		add(lblNacionalidad);
		
		textNacionalidad = new JTextField();
		textNacionalidad.setEditable(false);
		textNacionalidad.setBounds(171, 269, 192, 20);
		add(textNacionalidad);
		textNacionalidad.setColumns(10);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(264, 348, 89, 23);
		add(btnSiguiente);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(65, 348, 89, 23);
		add(btnAtrs);


	}
}
