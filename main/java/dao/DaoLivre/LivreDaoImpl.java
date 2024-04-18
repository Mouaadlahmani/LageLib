
package dao.DaoLivre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import metier.metierLivre.Livre;

public class LivreDaoImpl implements IlivreDio {

	@Override
	public Livre Save(Livre livre) {
		
		Connection connection=SinglotonConnection.getConnection();
		
		
		try {
			String Query="INSERT INTO livres(titre,auteur,editeur,année_de_publication)VALUES(?,?,?,?)";
			  PreparedStatement ps=connection.prepareStatement(Query);
			  ps.setString(1, livre.getTitre());
			  ps.setString(2, livre.getAuteur());
			  ps.setString(3, livre.getEditeur());
			  ps.setDate(4, livre.getAnnée_de_publication());
			  ps.executeUpdate(); 
			  
			  PreparedStatement ps2=connection.prepareStatement("SELECT MAX(id) AS MAXID FROM produits");
			  ResultSet rs=ps2.executeQuery(); 
			  if(rs.next()) { 
				  livre.setId(rs.getInt("MAXID"));
			  } 
			  ps.close(); 
			  } catch (SQLException e) { 
			  e.printStackTrace(); 
			  }
			  
			 
			  
		// TODO Auto-generated method stub
		return livre;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  /*@Override public Produit save(Produit p) {
	  
	  Connection connection= SinglotonConnection.getConnection(); 
	  try {
	  PreparedStatement ps=connection.
	  prepareStatement("INSERT INTO produits(nom_produit,prix,quantite_en_stock,descript)VALUES(?,?,?,?)"
	  ); ps.setString(1, p.getNomProduit()); ps.setDouble(2, p.getPrix());
	  ps.setInt(3, p.getQuantite()); ps.setString(4, p.getDescription());
	  ps.executeUpdate(); PreparedStatement
	  ps2=connection.prepareStatement("SELECT MAX(id) AS MAXID FROM produits");
	  ResultSet rs=ps2.executeQuery(); if(rs.next()) { p.setId(rs.getInt("MAXID"));
	  } ps.close(); } catch (SQLException e) { // TODO Auto-generated catch block
	  e.printStackTrace(); }
	  
	  return p; }
	  
	  @Override public List<Produit> ProduitsParMC(String mc) { List<Produit>
	  produits=new ArrayList<>(); Connection connection=
	  SinglotonConnection.getConnection();
	  
	  try { PreparedStatement
	  ps=connection.prepareStatement("SELECT* FROM produits WHERE nom_produit=? ");
	  
	  ps.setString(1, mc); ResultSet rs=ps.executeQuery(); while(rs.next()) {
	  
	  
	  Produit p=new Produit(); p.setId(rs.getInt("id"));
	  p.setNomProduit(rs.getString("nom_produit"));
	  p.setPrix(rs.getDouble("prix"));
	  p.setQuantite(rs.getInt("quantite_en_stock"));
	  p.setDescription(rs.getString("descript")); produits.add(p); } } catch
	  (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	  return produits; }
	  
	  @Override public Produit getProduit(int id) { Connection connection=
	  SinglotonConnection.getConnection(); Produit p=new Produit(); try {
	  PreparedStatement
	  ps=connection.prepareStatement("SELECT* FROM produits WHERE id=? ");
	  
	  ps.setInt(1, id); ResultSet rs=ps.executeQuery(); if(rs.next()) {
	  
	  p.setId(rs.getInt("id")); p.setNomProduit(rs.getString("nom_produit"));
	  p.setPrix(rs.getDouble("prix"));
	  p.setQuantite(rs.getInt("quantite_en_stock"));
	  p.setDescription(rs.getString("descript"));
	  
	  } } catch (SQLException e) { // TODO Auto-generated catch block
	  e.printStackTrace(); }
	  
	  return p; }
	  
	  @Override public Produit updateProduit(Produit p) { Connection connection=
	  SinglotonConnection.getConnection(); try { PreparedStatement ps=connection.
	  prepareStatement("UPDATE  produits SET nom_produit=?,prix=?,quantite_en_stock=?,descript=? WHERE id=?"
	  );
	  
	  ps.setString(1, p.getNomProduit()); ps.setDouble(2, p.getPrix());
	  ps.setInt(3, p.getQuantite()); ps.setString(4, p.getDescription());
	  ps.setInt(5,p.getId());
	  
	  ps.executeUpdate(); ps.close();
	  
	  } catch (SQLException e) { // TODO Auto-generated catch block
	  e.printStackTrace(); } return p; }
	  
	  @Override public void deleteProduit(int id) {
	  
	  
	  
	  Connection connection= SinglotonConnection.getConnection(); try {
	  PreparedStatement
	  ps=connection.prepareStatement("DELETE FROM produits WHERE ID=?");
	  ps.setInt(1, id); ps.executeUpdate(); ps.close(); } catch (SQLException e) {
	  // TODO Auto-generated catch block e.printStackTrace(); }
	  
	  
	  
	  }
	  
	  @Override public List<Produit> getTousProduits() {
	  
	  List<Produit> produits=new ArrayList<>(); Connection connection=
	  SinglotonConnection.getConnection();
	  
	  try { PreparedStatement
	  ps=connection.prepareStatement("SELECT* FROM produits");
	  
	  ResultSet rs=ps.executeQuery(); while(rs.next()) { Produit p=new Produit();
	  p.setId(rs.getInt("id")); p.setNomProduit(rs.getString("nom_produit"));
	  p.setPrix(rs.getDouble("prix"));
	  p.setQuantite(rs.getInt("quantite_en_stock"));
	  p.setDescription(rs.getString("descript")); produits.add(p); } } catch
	  (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	  return produits; }
	 
*/
}
