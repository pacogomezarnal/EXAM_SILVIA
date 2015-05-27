package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;



import Modelo.Cadete;
import Modelo.DatosCadete;


import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Iterator;

public class PerfilEquipo extends JPanel {

	private JLabel lblfoto, lblNombre, lblId,lbl1Apellido, lbl2Apellido, lblEdad, lblNacionalidad; 
	private JTextField textNombre, textId, textApellidos, textEdad, textNacionalidad;
	private JButton btnSiguiente, btnAtrs;
	private JComboBox<String> boxEquipo;
	private JPanel panel3, panel1;
	private DatosCadete users;
	/**
	 * Create the panel.
	 */
	public PerfilEquipo(JPanel perfil,DatosCadete datosCadete) {
		
		setLayout(null);
		
		boxEquipo = new JComboBox<String>();
		boxEquipo.setBounds(10, 34, 144, 20);
		add(boxEquipo);
		users = new DatosCadete();
		
		
		Iterator<String> it =users.getCadetes().iterator();
		while(it.hasNext()){
			
			boxEquipo.addItem((String)it.next());
		}
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(171, 11, 46, 14);
		add(lblNombre);
		
		lblId = new JLabel("Id");
		lblId.setBounds(317, 11, 46, 14);
		add(lblId);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setBounds(164, 34, 130, 20);
		add(textNombre);
		textNombre.setColumns(10);
		
		textId = new JTextField();
		textId.setEditable(false);
		textId.setBounds(317, 34, 76, 20);
		add(textId);
		textId.setColumns(10);
		
		lbl1Apellido = new JLabel("1er Apellido");
		lbl1Apellido.setBounds(171, 65, 99, 14);
		add(lbl1Apellido);
		
		textApellidos = new JTextField();
		textApellidos.setEditable(false);
		textApellidos.setBounds(171, 90, 192, 20);
		add(textApellidos);
		textApellidos.setColumns(10);
		
		lbl2Apellido = new JLabel("2\u00BA Apellido");
		lbl2Apellido.setBounds(171, 135, 81, 14);
		add(lbl2Apellido);
		
		textEdad = new JTextField();
		textEdad.setEditable(false);
		textEdad.setBounds(171, 160, 192, 20);
		add(textEdad);
		textEdad.setColumns(10);
		
		lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(171, 191, 99, 14);
		add(lblNacionalidad);
		
		textNacionalidad = new JTextField();
		textNacionalidad.setEditable(false);
		textNacionalidad.setBounds(171, 216, 192, 20);
		add(textNacionalidad);
		textNacionalidad.setColumns(10);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel3=new Comprobacion(perfil, datosCadete); 
				perfil.add(panel3, "comprobacion");
				CardLayout c=(CardLayout) perfil.getLayout();
				c.show(perfil, "comprobacion");
			}
		});
		btnSiguiente.setBounds(256, 267, 89, 23);
		add(btnSiguiente);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1=new PerfilUsuario(perfil, datosCadete); 
				perfil.add(panel1, "perfilUsuario");
				CardLayout c=(CardLayout) perfil.getLayout();
				c.show(perfil, "perfilUsuario");
			}
		});
		btnAtrs.setBounds(65, 267, 89, 23);
		add(btnAtrs);


	}
}
