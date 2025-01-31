package bataille_finale;

public class Amphitheatre implements Narrateur{

	@Override
	public void afficherDecor() {
		System.out.println("Dans un amphithéâtre près de Rome des combattants vont s'affronter.");
	}

	@Override
	public void afficherVainqueur(int nbVictoireGauloise, int nbVictoireRomaine) {
		if(nbVictoireGauloise<nbVictoireRomaine) {
			System.out.println("César se lève et applaudit ses valeureux soldats");
		}
		else {
			System.out.println("Les Gaulois vont pouvoir rentrer chez eux alors que César est affligé par l'incompétence de ses soldats");
		}
	}
	

}
