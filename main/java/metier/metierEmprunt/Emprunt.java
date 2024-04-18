package metier.metierEmprunt;
 
import java.sql.Date;

public class Emprunt {
	private int livreId;
	private int membreId;
	private Date date_retour;
	private Date date_demprunt;
	private String statut;
	public Emprunt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emprunt(int livreId, int membreId, Date date_retour, Date date_demprunt, String status) {
		super();
		this.livreId = livreId;
		this.membreId = membreId;
		this.date_retour = date_retour;
		this.date_demprunt = date_demprunt;
		this.statut = status;
	}
	public int getLivreId() {
		return livreId;
	}
	public void setLivreId(int livreId) {
		this.livreId = livreId;
	}
	public int getMembreId() {
		return membreId;
	}
	public void setMembreId(int membreId) {
		this.membreId = membreId;
	}
	public Date getDate_retour() {
		return date_retour;
	}
	public void setDate_retour(Date date_retour) {
		this.date_retour = date_retour;
	}
	public Date getDate_demprunt() {
		return date_demprunt;
	}
	public void setDate_demprunt(Date date_demprunt) {
		this.date_demprunt = date_demprunt;
	}
	public String getStatus() {
		return statut;
	}
	public void setStatus(String status) {
		this.statut = status;
	}
	@Override
	public String toString() {
		return "Emprunt [livreId=" + livreId + ", membreId=" + membreId + ", date_retour=" + date_retour
				+ ", date_demprunt=" + date_demprunt + ", status=" + statut + "]";
	}
	
}
