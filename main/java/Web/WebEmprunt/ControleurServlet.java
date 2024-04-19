package Web.WebEmprunt;

import java.io.IOException;
import java.util.List;

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
		}
		else {
			resp.sendError(resp.SC_NOT_FOUND);
		}
		
	}
}
