import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectarStatic {

	private static Connection conexion;
	private static String bd = "base1";
	private static String user = "root";
	private static String password = "despliegue";
	private static String host = "localhost";
	private static String server = "jdbc:mysql://" + host + "/" + bd;
	
	/*public void cerrar (Connection con){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error al salir en el metodo cerrar");
		}
	}*/
	
	public static Connection getConexion() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(server, user, password);
			System.out.println("Conexión a base de datos " + server + " de conectarStatic");
		}catch (ClassNotFoundException ex){
			System.out.println("Error cargando el Driver MySQL JDBC");
		}catch (SQLException e){
			System.out.println("Error conectar");
		}
		
		return conexion;
		
	}

}
