package Web.WebLivre;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.metierLivre.Livre;

import java.io.IOException;
import java.sql.Date;

import dao.DaoLivre.IlivreDio;
import dao.DaoLivre.LivreDaoImpl;



public class ServletLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private IlivreDio Dao ; 
       
public void init() throws ServletException{
       	Dao=new LivreDaoImpl();
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     
		   String path=request.getServletPath();	
		   if(path.equals("/livres.liv")) {
			   
			    ModelLivre model=new ModelLivre();
			    model.setLivres(Dao.getTousLivres());
			    request.setAttribute("Touslivres", model);
				request.getRequestDispatcher("Jsp/livres.jsp").forward(request, response);	
				
		   } else if(path.equals("/Supprimer.liv")) { 
			   int id =Integer.parseInt(request.getParameter("id"));
			   Dao.deleteLivre(id);
			  response.sendRedirect("livres.liv");
		   }
		   
		   
		   else {
		    	response.sendError(response.SC_NOT_FOUND);
		    }
				
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String path=request.getServletPath();
		    if(path.equals("/Html/NewLivre.liv")) {
			   String titre=request.getParameter("titre");
			   String auteur=request.getParameter("auteur");
			   String editeur=request.getParameter("editeur");
			   Date date= Date.valueOf(request.getParameter("date"));
			   Livre livre=new  Livre( titre, auteur, editeur, date);
			   Dao.Save(livre);
			  request.getRequestDispatcher("Jsp/livres.jsp").forward(request, response);	
		   }
		//doGet(request, response);
	}

}
