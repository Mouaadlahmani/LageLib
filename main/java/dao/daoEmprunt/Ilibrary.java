package dao.daoEmprunt;

import java.util.List;

import metier.metierEmprunt.*;

public interface Ilibrary {
	public Emprunt ajouter(Emprunt E);
	public List<Emprunt> chercher(String mc);
	public Emprunt getProduct(int id);
	public Emprunt modifie(Emprunt E);
	public void suprimer(int id);
}
