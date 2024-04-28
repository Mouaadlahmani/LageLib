package dao.DaoLivre;

import java.util.List;

import metier.metierLivre.Livre;

public interface IlivreDio {
    public Livre Save(Livre livre);
    public List<Livre> getTousLivres();
    public  void deleteLivre(int id);
	
}
