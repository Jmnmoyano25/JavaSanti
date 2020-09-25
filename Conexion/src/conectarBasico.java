import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectarBasico {
	
	private Connection miConexion;
	private String bd = "base1";
	private String user = "root";
	private String password = "despliegue";
	private String host = "localhost";
	private String server = "jdbc:mysql://" + host + "/" + bd;
	
	public conectarBasico() {	
	}
	public conectarBasico(String usuario, String pass, String bbdd){
		this.user = usuario;
		this.password = pass;
		this.bd = bbdd;
		this.server = "jdbc:mysql://" + host + "/" + bd;
	}
	
	
	public Connection getConexion() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			miConexion = DriverManager.getConnection(server, user, password);
			System.out.println("Conexión a base de datos " + server + " de conectarBasico");			
		}catch (ClassNotFoundException ex){
			System.out.println("Error cargando el Driver MySQL JDBC");
		}catch (SQLException e){
			System.out.println("Error conectar");
		}
		
		return miConexion;

	}
}	