package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import Modelo.Cadete;
import Modelo.IngresoLaby;

public class Comprobacion extends JPanel {
	private JTextField textId, text1Apellido, textMensDev;
	private JLabel lblId, lbl1Apellido;
	private JButton btnComprobar, btnAtrs;

	/**
	 * Create the panel.
	 */
	public Comprobacion(JPanel perfil,Cadete datosusuarios) {
		setLayout(null);
		
		textId = new JTextField();
		textId.setBounds(55, 62, 86, 20);
		add(textId);
		textId.setColumns(10);
		
		text1Apellido = new JTextField();
		text1Apellido.setBounds(173, 62, 156, 20);
		add(text1Apellido);
		text1Apellido.setColumns(10);
		
		lblId = new JLabel("Id");
		lblId.setBounds(55, 37, 46, 14);
		add(lblId);
		
		lbl1Apellido = new JLabel("1er Apellido");
		lbl1Apellido.setBounds(173, 37, 86, 14);
		add(lbl1Apellido);
		
		btnComprobar = new JButton("COMPROBAR");
		btnComprobar.setBounds(55, 150, 296, 23);
		add(btnComprobar);
		
		textMensDev = new JTextField();
		textMensDev.setBounds(55, 199, 296, 20);
		add(textMensDev);
		textMensDev.setColumns(10);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(21, 353, 89, 23);
		add(btnAtrs);

	}

	

}
