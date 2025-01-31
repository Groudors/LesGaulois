package test_fonctionnel;

import bataille_finale.*;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;

public class TestArmoricae {
	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 10, 5);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 100);
		Romain minus = new Romain("Minus", 6);
		Romain chorus = new Romain("Chorus", 8);
		Romain faitexcus = new Romain("Faitexcus", 7);
		
		Narrateur foret = new Foret();
		foret.affichertitre();
		foret.afficherDebutLivre();
		
		Bataille bataille = new Bataille(foret);
		bataille.ajouterGaulois(obelix);
		bataille.ajouterGaulois(asterix);
		bataille.ajouterRomain(minus);
		bataille.ajouterRomain(chorus);
		bataille.ajouterRomain(faitexcus);
		druide.preparerPotion();
		druide.booster(asterix);
		minus.sEquiper(Equipement.BOUCLIER);
		chorus.sEquiper(Equipement.CASQUE);
		faitexcus.sEquiper(Equipement.BOUCLIER);
		faitexcus.sEquiper(Equipement.CASQUE);
		bataille.afficherEquipes();
		do {
			bataille.combattre();
		} while (bataille.resteCombattant());
		
		bataille.afficherVainqueur();
		
	}

}