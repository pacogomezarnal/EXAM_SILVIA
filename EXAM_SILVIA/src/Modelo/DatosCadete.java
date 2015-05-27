package Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

import Modelo.ConexionDB;

public class DatosCadete {
	private Connection conexion = null;
	private Statement instruccion =null;
	private ResultSet conjuntoResultados=null;
	private  final static String USERS_SEL = "SELECT * FROM cadetes where equipo='2'";
	private  final static String USER_COL = "nombre";
	private ArrayList<String> users=null;
	
	public DatosCadete(){
		
		this.conexion=ConexionDB.getConexion();
		users=new ArrayList<String>();
		
	}

public ArrayList getCadetes(){
		
		try{
			//creamos un statement, un canal entre app y BBDD
			instruccion=conexion.createStatement();
			
			//asignamos a la variable lo que devuelve la query
			conjuntoResultados=instruccion.executeQuery(USERS_SEL);
			
			//mientras haya resultados que los coloque en el arraylist
			while (conjuntoResultados.next()){
				
				users.add(conjuntoResultados.getString(USER_COL));
			}
			return users;
		}
		catch (SQLException excepcionSql){
			
			excepcionSql.printStackTrace();
			return users;
		} 
		finally //para que siga ejecutando el try
		{
			try{
				//cerramos el resultset y despues el singleton
				conjuntoResultados.close();
				instruccion.close();
			}
			catch (SQLException excepcionSql){
				excepcionSql.printStackTrace();
			}
		}
	}
	
	/*public ArrayList<String[]> getCadetes(){
		//creo arrayList para almacenar resultado de la consulta
		ArrayList<String[]> usuarios=new ArrayList<String[]>();
		
		try{
			//sentencia sql
			this.sql = this.conexion.createStatement();
			this.resultados = sql.executeQuery("select * from cadetes where id='27'");
					
			//Recorremos los resultados y los almacenamos en un ArrayList
			
			
			while( resultados.next() ) {
				String[] cadete=new String[7];
				cadete[0]=resultados.getString("id");
				cadete[1]=resultados.getString("nombre");
				cadete[2]=resultados.getString("apellidos");
				cadete[3]=resultados.getString("edad");
				cadete[4]=resultados.getString("nacionalidad");
				cadete[5]=resultados.getString("equipo");
				usuarios.add(cadete);
			}
			
		}catch( SQLException excepcionSql ) {
			excepcionSql.printStackTrace();
		}finally{
			try{
				resultados.close();
				sql.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
		return usuarios;
	}*/
}
