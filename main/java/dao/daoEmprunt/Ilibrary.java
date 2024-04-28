package dao.daoEmprunt;

import java.util.List;

import metier.metierEmprunt.*;

public interface Ilibrary {
	public Emprunt ajouter(Emprunt E);
	public List<Emprunt> chercher(String mc);
	public List<Emprunt> Afficher();
	public Emprunt modifie(Emprunt E);
	public void suprimer(int mem_id);
}
