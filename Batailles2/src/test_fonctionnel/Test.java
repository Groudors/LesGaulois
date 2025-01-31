package test_fonctionnel;

import personnages.*;
import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;



public class Test {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix" ,8);
		Equipement bouclier=Equipement.BOUCLIER;
		Equipement casque=Equipement.CASQUE;
		Gaulois obelix = new Gaulois ("Obélix", 12);
		
		
		Romain minus= new Romain ("Minus",6);
//		minus.sEquiper(bouclier);
//		minus.sEquiper(casque);

		Druide panoramix=new Druide("Panoramix", 10,5);
		panoramix.parler("Je vais aller préparer une petite potion");
		panoramix.preparerPotion();
		
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		
		asterix.parler("Bonjour, je suis " + asterix.getNom());
		minus.parler("UN GAU… UN GAUGAU…");
		
		for(int i=0;i<2;i++) {
			asterix.frapper(minus);
		}
}
	
	
}

