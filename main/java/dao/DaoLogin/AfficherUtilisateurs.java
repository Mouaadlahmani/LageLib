package dao.DaoLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AfficherUtilisateurs {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            // Établir la connexion à la base de données
            String url = "jdbc:mysql://localhost:3306/bibliotheque";
            String username = "root";
            String password = "kenzi123";
            connection = DriverManager.getConnection(url, username, password);
            
            // Préparer la requête SQL pour sélectionner tous les utilisateurs
            String query = "SELECT * FROM users";
            statement = connection.prepareStatement(query);
            
            // Exécuter la requête et obtenir le résultat
            resultSet = statement.executeQuery();
            
            // Parcourir les résultats et afficher chaque utilisateur
            while (resultSet.next()) {
                int id = resultSet.getInt("user_id");
                String nom = resultSet.getString("username");
                String prenom = resultSet.getString("passwd");
               
                
                System.out.println("ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources JDBC dans le bloc finally
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
