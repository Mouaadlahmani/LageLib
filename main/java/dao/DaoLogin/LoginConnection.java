package dao.DaoLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class LoginConnection {
		private static Connection connection;
		
		static {
			String url="jdbc:mysql://localhost:3306/bibliotheque";
			String username="root";
			String password="kenzi123";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				connection =DriverManager.getConnection(url,username,password);
				PreparedStatement cn=connection.prepareStatement
	                    ("SELECT * FROM users");
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			
		}			
		}
		  public static void testConnection() {
		        if (connection != null) {
		            try {
		                PreparedStatement statement = connection.prepareStatement("SELECT 1");
		                ResultSet resultSet = statement.executeQuery();
		                if (resultSet.next()) {
		                    System.out.println("Connexion à la base de données établie avec succès !");
		                } else {
		                    System.out.println("La connexion à la base de données a échoué.");
		                }
		            } catch (SQLException e) {
		                e.printStackTrace();
		            }
		        } else {
		            System.out.println("La connexion à la base de données n'a pas été initialisée.");
		        }
		  }
		
	}
