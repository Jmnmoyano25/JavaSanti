import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class seguir {

	private Connection con;

	public seguir() {
		conectarBasico unaConexion = new conectarBasico();
		Scanner sc = new Scanner(System.in);
		System.out.println("USUARIO: ");
		String usuario = sc.next();
		System.out.println("PASSWORD MACHO: ");
		String pass = sc.next();
		System.out.println("BASE DE DATOS: ");
		String bbdd = sc.next();

		con = unaConexion.getConexion();

		if (con == null) {
			System.out.println("Conectando con seguir");
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Error al cerrar la conexión");
				e.printStackTrace();
			}
		} else {
			System.out.println("La conexión no se ha producido en seguir");
			System.out.println("Fallo en la conexión");
		}

	}

}
