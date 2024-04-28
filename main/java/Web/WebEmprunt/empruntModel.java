package Web.WebEmprunt;

import java.util.ArrayList;
import java.util.List;

import metier.metierEmprunt.Emprunt;

public class empruntModel {
	private String motCle;
	private List<Emprunt> emprunts = new ArrayList<Emprunt>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Emprunt> getEmprunts() {
		return emprunts;
	}
	public void setEmprunts(List<Emprunt> Emprunts) {
		this.emprunts = Emprunts;
	}
	
}
