package bataille_finale;

public class Foret implements Presentateur{

	@Override
	public void afficherVainqueur(int nbVictoireGauloise, int nbVictoireRomaine) {
		if(nbVictoireGauloise<nbVictoireRomaine) {
			System.out.println("César sera fier en apprenant que les Romains ont remporté la bataille");
		}
		else {
			System.out.println("Les Gaulois vont pouvoir célébrer leur victoire autour d'un banquet");
		}
	}

	public void afficherTitre() {
		Presentateur.super.afficherTitre();
	}

	@Override
	public void afficherDecor() {
		// TODO Je ne sais pas pourquoi c'est comme ça, donc je n'y touche pas
		
	}




}
