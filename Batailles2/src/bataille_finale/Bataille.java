package bataille_finale;
import personnages.*;
import java.util.Random;
public class Bataille {
	private Gaulois[] equipeGauloise=new Gaulois[3] ;
	private Romain[] equipeRomaine=new Romain[3] ;
	private int nbRomain=0;
	private int nbGaulois=0;
	private int nbVictoireRomaine =0;
	private int nbVictoireGauloise =0;
	private Narrateur presentateur;
	
	public Bataille(Narrateur narrateur) {
		this.presentateur=narrateur;
		presentateur.afficherDecor();
	}
	
	public void ajouterGaulois(Gaulois gaulois) {
		int i=0;
		while(i<3 && equipeGauloise[i]!=null) {
			i+=1;
		}
		if(i==3) {
			System.out.println("Le camps Gaulois est déjà plein !");
		}
		else {
			equipeGauloise[i]=gaulois;
			nbGaulois+=1;
		}
	}
	
	
	public void ajouterRomain(Romain romain) {
		int i=0;
		while(i<3 && equipeRomaine[i]!=null) {
			i+=1;
		}
		if(i==3) {
			System.out.println("Le camps Romain est déjà plein !");
		}

		else {
			equipeRomaine[i]=romain;
			nbRomain+=1;
		}
	}
	
	
	public void afficherEquipes() {
		int i =0;
		if (nbGaulois==0){
			System.out.println("Les Gaulois n'ont personne pour se battre");
		}
		else {
			System.out.println("Les Gaulois toujours prêts pour la baston sont : ");
			
			while(i<3 && equipeGauloise[i]!=null){
				if (equipeGauloise[i]!=null) {
					System.out.println(equipeGauloise[i].getNom());
				}
				i+=1;
			}
		}
		
		i=0;
		if(nbRomain==0) {
			System.out.println("Les Romains n'ont personne pour se battre");

			
		}
		else {
			System.out.println("Les Romains devant combattre sont :");
			while(i<3){
				if (equipeRomaine[i]!=null) {
					System.out.println(equipeRomaine[i].getNom());
				}
				i+=1;
		}
		}
	}
	
	public void combattre() {
		Combattant gaulois = equipeGauloise[nbGaulois - 1];
		Combattant romain = equipeRomaine[nbRomain - 1];
		boolean vainqueur = false;
		do {
			romain.frapper(gaulois);
			if (gaulois.isKO()) {
				vainqueur = true;
				nbGaulois--;
				nbVictoireRomaine++;
			} else {
				gaulois.frapper(romain);
				if (romain.isKO()) {
					vainqueur = true;
					nbRomain--;
					nbVictoireGauloise++;
				}
			}
		} while (!vainqueur);
	}

	public boolean resteCombattant() {
		return nbGaulois != 0 && nbRomain != 0;
	}
	
	public void afficherVainqueur() {
		presentateur.afficherVainqueur(nbVictoireGauloise, nbVictoireRomaine);
		
	}
	
	
//	public void bagarre() {
//		Druide panoramix = new Druide("Panoramix",5,10);
//		Random random = new Random();
//		Gaulois combattantG;
//		Romain combattantR;
//		
//		int i =random.nextInt(5);
//		while(campsGaulois[i]==null) {
//			i=random.nextInt(5);
//		}
//		combattantG=campsGaulois[i];
//		
//		i =random.nextInt(5);
//		while(campsRomain[i]==null) {
//			i=random.nextInt(5);
//		}
//		combattantR=campsRomain[i];
//		System.out.println("Bagarre entre " + combattantR.getNom() + " et " + combattantG.getNom());
//		
//		if (combattantG.getForce()>combattantR.getForce()) {
//			combattantG.frapper(combattantR);
//			if (combattantR.getForce()<=0) {
//				for(int j=0;j<5;j++) {
//					if (campsRomain[j]==combattantR){
//						campsRomain[j]=null;
//					}
//			}
//		}
//		else {
//			if (combattantG.getPotion()==1) {
//				panoramix.booster(combattantG);
//			}
//			else {
//				for(int j=0;j<5;j++) {
//					if (campsGaulois[j]==combattantG){
//						campsGaulois[j]=null;
//					}
//				}
//			}
////		}
////	}
//	
//	}
}
