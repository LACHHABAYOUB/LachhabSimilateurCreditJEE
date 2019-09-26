package web;

public class CreditModel {
	private double montant;
	private int duree;
	private double taux;
	private double mensualte;
	public CreditModel(double montant, int duree, double taux, double mensualte) {
		super();
		this.montant = montant;
		this.duree = duree;
		this.taux = taux;
		this.mensualte = mensualte;
	}
	public CreditModel() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public double getMensualte() {
		return mensualte;
	}
	public void setMensualte(double mensualte) {
		this.mensualte = mensualte;
	}

}
