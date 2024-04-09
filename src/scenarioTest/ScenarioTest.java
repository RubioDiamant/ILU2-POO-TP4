package scenarioTest;

import Produit.*;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	private Gaulois obelix = new Gaulois("Obelix",10);
	private Etal<Sanglier> etalSanglier = new Etal<>();
	public static void main(String[] args) {
//		IEtal[] marche = new IEtal[3]; //On ne peut pas avoir de tableau de type g�n�rique
//		Etal<Sanglier> etalSanglier = new Etal<>();
//		Etal<Poisson> etalPoisson = new Etal<>();
//		marche[0] = etalSanglier;
//		marche[1] = etalPoisson;
//		marche[0].occuperEtal(new Gaulois("Ordralfab�tix", 12), new Poisson(12, "lundi"), 10); //poisson dans sanglier !
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		Etal[] marche = new Etal[3];
		Produit sanglier = new Produit("Sanglier", Unite.KILOGRAMME);
		Etal<Sanglier> etal1 = new Etal<>();
		Etal<Sanglier> etal2 = new Etal<>();
		Etal<Poisson> etal3 = new Etal<>();
		marche[0] = etal1;
		marche[1] = etal2;
		marche[2] = etal3;
		
		marche[0].installerVendeur(obelix, sangliersObelix, 8);
		marche[1].installerVendeur(asterix, sangliersAsterix, 10);
		marche[2].installerVendeur(ordralfabetix, poissons, 7);
		
		for(int i = 0; i < marche.length; i++) {
			System.out.println(marche[i].etatEtal());
		}
		
		int sanglierAchete = 0;
		int qtDispo = -1;
		 
		for(int i = 0; i < marche.length; i++) {
				qtDispo = marche[i].contientProduit("Sanglier", 3);
				if(qtDispo >= 3) {
					marche[i].acheterProduit(3);
				}else {
					marche[i].acheterProduit(qtDispo);
				}
				
		}
		
		
		

	}
	
}
