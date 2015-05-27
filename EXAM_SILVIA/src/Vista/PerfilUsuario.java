package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

import Modelo.Cadete;
import Modelo.IngresoLaby;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerfilUsuario extends JPanel {
	private JLabel lblfoto, lblNombre, lblId, lblApellidos, lblEdad, lblNacionalidad; 
	private JTextField textNombre, textId, textApellidos, textEdad, textNacionalidad;
	private JButton btnSiguiente;

	/**
	 * Create the panel.
	 */
	public PerfilUsuario(JPanel perfil,Cadete datosCadete) {
		
		setLayout(null);
		
		lblfoto = new JLabel("");
		lblfoto.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/Images/fotoUser.jpg")));
		lblfoto.setBounds(10, 37, 141, 180);
		add(lblfoto);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(161, 37, 46, 14);
		add(lblNombre);
		
		lblId = new JLabel("Id");
		lblId.setBounds(307, 37, 46, 14);
		add(lblId);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setBounds(161, 62, 130, 20);
		add(textNombre);
		textNombre.setColumns(10);
		
		textId = new JTextField();
		textId.setEditable(false);
		textId.setBounds(307, 62, 86, 20);
		add(textId);
		textId.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(161, 105, 46, 14);
		add(lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setEditable(false);
		textApellidos.setBounds(161, 135, 192, 20);
		add(textApellidos);
		textApellidos.setColumns(10);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(161, 175, 46, 14);
		add(lblEdad);
		
		textEdad = new JTextField();
		textEdad.setEditable(false);
		textEdad.setBounds(161, 200, 192, 20);
		add(textEdad);
		textEdad.setColumns(10);
		
		lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(161, 243, 99, 14);
		add(lblNacionalidad);
		
		textNacionalidad = new JTextField();
		textNacionalidad.setEditable(false);
		textNacionalidad.setBounds(161, 268, 192, 20);
		add(textNacionalidad);
		textNacionalidad.setColumns(10);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		//btnSiguiente.setVisible(true);
		btnSiguiente.setBounds(264, 348, 89, 23);
		add(btnSiguiente);

	}
}
