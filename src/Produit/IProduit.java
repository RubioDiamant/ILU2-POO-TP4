package Produit;

public interface IProduit {

	String getDescription();

	void setDescription(String description);

	String getNom();
	
	double calculerPrix(double prix);

}