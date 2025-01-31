package test_fonctionnel;

import personnages.Druide;
import personnages.Personnage;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;

public class TestFinal {
	public static void main(String[] args) {
//		Druide druide = new Druide("Panoramix",10, 5);
//		druide.parler("Je vais aller préparer une petite potion...");
//		druide.preparerPotion();
//		Gaulois obelix = new Gaulois("Obélix", 25);
//		Gaulois asterix = new Gaulois("Astérix", 8);
//		druide.booster(obelix);
//		druide.booster(asterix);
//		asterix.parler("Bonjour");
//		Romain minus = new Romain("Minus", 6);
//		minus.parler("UN GAU... UN GAUGAU...");
//		minus.sEquiper(Equipement.CASQUE);
//		minus.sEquiper(Equipement.BOUCLIER);
//		for (int i = 0; i < 2; i++) {
//			
//			asterix.frapper(minus);
//		}
	Gaulois asterix = new Gaulois("Astérix", 8);
	Romain minus = new Romain("Minus", 6);
	asterix.frapper(minus);
	minus.frapper(asterix);
	minus.frapper(minus);
	}
}