package Vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;



import Modelo.Cadete;
import Modelo.DatosCadete;
import Modelo.IngresoLaby;

public class FrameLaby extends JFrame {

	private JPanel perfil;
	private DatosCadete datosCadete=new DatosCadete();

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public FrameLaby() {
		
		getContentPane().setLayout(null);
		setTitle("THE LABY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 443);
			
		
		
		perfil=new JPanel();
		getContentPane().add(perfil);
		perfil.setBounds(0, 23, 422, 320);
		perfil.setLayout(new CardLayout(0, 0));
		JPanel panel1=new PerfilUsuario (perfil, datosCadete);
		JPanel panel2=new PerfilEquipo (perfil, datosCadete);
		JPanel panel3=new Comprobacion(perfil, datosCadete);
		perfil.add(panel1,"perfilUsuario");
		perfil.add(panel2,"perfilEquipo");
		perfil.add(panel3,"comprobacion");
		
	}
}
