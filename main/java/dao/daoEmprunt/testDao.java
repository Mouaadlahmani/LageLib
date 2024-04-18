package dao.daoEmprunt;

import java.sql.Date;
import java.util.List;

import metier.metierEmprunt.*;

public class testDao {
	public static void main(String[] args){
		/*Date d =new Date(2024,04,29);
		Date d1 =new Date(2024,04,18);
		IlibraryImpl l = new IlibraryImpl();
		Emprunt Em = l.ajouter(new Emprunt(1,1,d,d1,"en cours"));
		System.out.println(Em.toString());*/
		IlibraryImpl l = new IlibraryImpl();
		List<Emprunt> Empr=l.chercher("%1%");
		for(Emprunt E :Empr){
			System.out.println(E.toString());
		}
	}
}