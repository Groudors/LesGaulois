package personnages;
import java.util.Random;
import personnages.Gaulois;
import personnages.Personnage;

public class Druide extends Personnage{
	private int FORCE_POTION_MIN;
	private int FORCE_POTION_MAX;
	private int forcePotion;
	
	public Druide(String nom, final int FORCE_POTION_MIN, final int FORCE_POTION_MAX) {
			super(nom);
			if (FORCE_POTION_MAX > FORCE_POTION_MIN) {
			this.FORCE_POTION_MIN = FORCE_POTION_MIN;
			this.FORCE_POTION_MAX = FORCE_POTION_MAX;
			} else {
			this.FORCE_POTION_MIN = FORCE_POTION_MAX;
			this.FORCE_POTION_MAX = FORCE_POTION_MIN;
			this.forcePotion=1;
			}
		}

	public String prendreParole() {
		return getNom() + " : ";
	}
	
	public void parler(String texte) {
		System.out.println("Le druide " + getNom()+ " : « " + texte + "»");
	}
	public void preparerPotion() {
		try {
			Random random = new Random();
				forcePotion=random.nextInt((FORCE_POTION_MAX - FORCE_POTION_MIN+1));
				forcePotion+=FORCE_POTION_MIN;
		}
		catch (IllegalArgumentException e) {
			System.err.println(" Erreur : " + e.getMessage() );
		}
		
		if(forcePotion>7) {
			parler("J'ai préparé une super potion de force");
			parler("La potion octroi une force de : " + forcePotion);
		}
		else {
			parler( "Je n'ai pas trouvé tous les ingrédients ma potion est seulement de force : " + forcePotion);
		}		
	}
	
	public void booster(Gaulois gaulois) throws PotionNonPreteException {
		if (forcePotion==1) {
			throw new PotionNonPreteException();
		}
		if (gaulois.getNom()=="Obélix") {
			parler("Non Obélix !!!... Tu n'auras pas de potion magique !!");
			gaulois.parler("Par Bélénos, ce n'est pas juste !");
		}
		else {
			parler("Tiens " + gaulois.getNom() + ", boit de la potion magique");
			gaulois.boirePotion(forcePotion);
		}
	}
	@Override
	public String getNom() {
		return nom;
	}
	
	
	
}
