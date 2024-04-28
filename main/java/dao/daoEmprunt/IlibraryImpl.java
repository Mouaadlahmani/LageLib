package dao.daoEmprunt;

import metier.metierEmprunt.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IlibraryImpl implements Ilibrary{

	@Override
	public Emprunt ajouter(Emprunt E) {
		Connection connection=ConnectionJDBC.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("INSERT INTO emprunts (livre_id, mem_id, date_retour, date_emprunt, statut) VALUES (?,?,?,?,?)");
			ps.setInt(1, E.getLivreId());
			ps.setInt(2, E.getMembreId());
			ps.setDate(3, E.getDate_retour());
			ps.setDate(4, E.getDate_demprunt());
			ps.setString(5, E.getStatut());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return E;
	}
	
	@Override
	public List<Emprunt> chercher(String mc) {
		List<Emprunt> Emprunts=new ArrayList<Emprunt>();
		Connection connection = ConnectionJDBC.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("SELECT * FROM EMPRUNTS WHERE mem_id LIKE ?");
			ps.setString(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Emprunt E=new Emprunt();
				E.setLivreId(rs.getInt("livre_id"));
				E.setMembreId(rs.getInt("mem_id"));
				E.setDate_retour(rs.getDate("date_retour"));
				E.setDate_demprunt(rs.getDate("date_emprunt"));
				E.setStatut(rs.getString("statut"));
				Emprunts.add(E);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Emprunts;
	}

	@Override
	public List<Emprunt> Afficher() {
		List<Emprunt> Emprunts=new ArrayList<Emprunt>();
		Connection connection = ConnectionJDBC.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("SELECT * FROM EMPRUNTS");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Emprunt E=new Emprunt();
				E.setLivreId(rs.getInt("livre_id"));
				E.setMembreId(rs.getInt("mem_id"));
				E.setDate_retour(rs.getDate("date_retour"));
				E.setDate_demprunt(rs.getDate("date_emprunt"));
				E.setStatut(rs.getString("statut"));
				Emprunts.add(E);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Emprunts;
}

	@Override
	public Emprunt modifie(Emprunt E) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void suprimer(int mem_id) {
		Connection connection=ConnectionJDBC.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("DELETE FROM EMPRUNTS WHERE mem_id=? and livre_id=?");
			ps.setInt(1, mem_id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
