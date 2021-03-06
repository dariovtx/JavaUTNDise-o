package tpUtn.hotel.implementacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public interface ConexionDB {
	default Connection getConexion() {
		Connection conexion = null;
		try {
			Properties propiedades = new Properties();
			propiedades.load(new FileInputStream("src/recursos/database.properties"));
			String url = propiedades.getProperty("db.url");
			String user = propiedades.getProperty("db.user");
			String pass = propiedades.getProperty("db.pass","1234");
			
			Class.forName(propiedades.getProperty("db.driver"));
			conexion = DriverManager.getConnection(url,user,pass);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conexion;
	}
}
