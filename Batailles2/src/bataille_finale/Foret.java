package bataille_finale;

public class Foret implements Narrateur{

	@Override
	public void afficherDecor() {
		System.out.println("Dans une sombre forêt en Armoricae une bagarre va éclater.");
	}

	@Override
	public void afficherVainqueur(int nbVictoireGauloise, int nbVictoireRomaine) {
		if(nbVictoireGauloise<nbVictoireRomaine) {
			System.out.println("César sera fier en apprenant que les Romains ont remporté la bataille");
		}
		else {
			System.out.println("Les Gaulois vont pouvoir célébrer leur victoire autour d'un banquet");
		}
	}

}
