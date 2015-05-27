package Controlador;

import Vista.FrameLaby;
import Modelo.ConexionDB;

public class TheLaby {

	private static ConexionDB conexion;
	
	public static void main(String[] args) {
		conexion=ConexionDB.getInstance("localhost","gamedb","root","silphp");
		conexion.connectDB(); 
		FrameLaby frame = new FrameLaby();
		frame.setVisible(true);

	}

}
