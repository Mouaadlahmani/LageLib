package dao.DaoLivre;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import metier.metierLivre.Livre;





public class testDao {

	public static void main(String[] args) {
	 Date d=new Date(2000,6,8);
	    Livre live1 =new Livre("Anti gon","Ahmed s","editeur1",d);
	
	    LivreDaoImpl dio=new LivreDaoImpl();
	    dio.Save(live1);
	}

}
