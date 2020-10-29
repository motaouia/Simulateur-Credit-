package web;

public class CreditModel {
	private double montant;
	private int duree;
	private double taux;
	
	private double mensualitee;

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public double getMensualitee() {
		return mensualitee;
	}

	public void setMensualitee(double mensualitee) {
		this.mensualitee = mensualitee;
	}
	
	

}
