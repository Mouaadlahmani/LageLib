package Web.WebEmprunt;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.util.List;

import javax.xml.stream.events.Comment;

import dao.daoEmprunt.Ilibrary;
import dao.daoEmprunt.IlibraryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.metierEmprunt.Emprunt;

public class ControleurServlet extends HttpServlet{
	private Ilibrary metier;
	
	@Override
	public void init() throws ServletException {
		metier=new IlibraryImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		if(path.equals("/home.java")) {
			empruntModel mo=new empruntModel();
			List<Emprunt> Emprunts=metier.Afficher();
			mo.setEmprunts(Emprunts);
			req.setAttribute("mo", mo);
			req.getRequestDispatcher("Emprunt.jsp").forward(req, resp);
		}else if(path.equals("/chercher.java")) {
			String motCle=req.getParameter("motCle");
			empruntModel model=new empruntModel();
			model.setMotCle(motCle);
			List<Emprunt> Emprunts=metier.chercher("%"+motCle+"%");
			model.setEmprunts(Emprunts);
			req.setAttribute("model", model);
			req.getRequestDispatcher("Emprunt.jsp").forward(req, resp);
		}else if(path.equals("/ajouter.java")) {
			req.getRequestDispatcher("Ajouter.jsp").forward(req, resp);
		}else if(path.equals("/save.java")&&(req.getMethod().equals("POST"))){
			int livre_id = Integer.parseInt(req.getParameter("livreId"));
			int membre_id = Integer.parseInt(req.getParameter("membreId"));
			 Date date_retour = Date.valueOf(req.getParameter("dateRetour"));
		     Date date_emprunt = Date.valueOf(req.getParameter("dateEmprunt"));
			Emprunt E = metier.ajouter(new Emprunt(livre_id,membre_id,date_retour,date_emprunt));
			req.setAttribute("Emprunts", E);
			req.getRequestDispatcher("Confirmation.jsp").forward(req, resp);
		}else if(path.equals("/supprimer.java")){
			int id= Integer.parseInt(req.getParameter("id"));
			metier.suprimer(id);
			resp.sendRedirect("home.java");
		}else if(path.equals("/modifier.java")) {
			
		}
		else {
			resp.sendError(resp.SC_NOT_FOUND);
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
