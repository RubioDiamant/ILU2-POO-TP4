package Produit;

public class Poisson extends Produit{
	
	private String datePeche;
	private String description;
	private int poids;
	
	public Poisson(int poids, String datePeche) {
		super("Poisson", Unite.GRAMME);
		this.datePeche = datePeche;
		this.poids = poids;
	}
	
	
}
