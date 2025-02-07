package test_fonctionnel;

import bataille_finale.*;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.PotionNonPreteException;
import personnages.Romain;

public class TestArmoricae {
	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 10, 5);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 100);
		Romain minus = new Romain("Minus", 6);
		Romain chorus = new Romain("Chorus", 8);
		Romain faitexcus = new Romain("Faitexcus", 7);
		
		Presentateur presentateur = new Foret();
		presentateur.afficherTitre();
		presentateur.afficherAuteur();
		presentateur.afficherDebutLivre();
		
		Bataille bataille = new Bataille(presentateur);
		bataille.ajouterGaulois(obelix);
		bataille.ajouterGaulois(asterix);
		bataille.ajouterRomain(minus);
		bataille.ajouterRomain(chorus);
		bataille.ajouterRomain(faitexcus);
//		druide.preparerPotion();
		try {
			druide.booster(asterix);
		}
		catch(PotionNonPreteException e) {
			System.err.println("Erreur : " + e.getMessage());
		}
		
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