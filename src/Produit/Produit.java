package Produit;

public class Produit implements IProduit {
	private String nom;
	private Unite unite;
	private String description;
	
	public Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public double calculerPrix(double prix) {
		return prix;
	}

}
