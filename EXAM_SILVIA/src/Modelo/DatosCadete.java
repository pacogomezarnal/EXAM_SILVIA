package Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

import Modelo.ConexionDB;

public class DatosCadete {
	private Connection conexion=null;
	private Statement sql = null;
	private ResultSet resultados = null;
	
	public DatosCadete(){
		
		this.conexion=ConexionDB.getConexion();
	}

}
