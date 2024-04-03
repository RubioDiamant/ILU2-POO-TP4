package scenarioTest;

import Produit.*;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	private Gaulois obelix = new Gaulois("Obelix",10);
	private Etal<Sanglier> etalSanglier = new Etal<>();
	public static void main(String[] args) {
		IEtal[] marche = new IEtal[3]; //On ne peut pas avoir de tableau de type générique
		Etal<Sanglier> etalSanglier = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
		marche[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson(12, "lundi"), 10); //poisson dans sanglier !
	}
	
}
