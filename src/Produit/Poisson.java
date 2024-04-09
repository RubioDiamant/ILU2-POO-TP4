package Produit;

public class Poisson extends Produit{
	
	private String datePeche;
	private String description;
	
	public Poisson(String datePeche) {
		super("Poisson", Unite.GRAMME);
		this.datePeche = datePeche;
	}
	
	
}
