package personnages;
import java.util.Random;
import personnages.Gaulois;
import personnages.Personnage;

public class Druide extends Personnage{
	private int FORCE_POTION_MIN;
	private int FORCE_POTION_MAX;
	private int forcePotion;
	private int Permisàpoint;
	public Druide(String nom, int force_potion_max, int force_potion_min) {
		super(nom);
		this.FORCE_POTION_MAX=force_potion_max;
		this.FORCE_POTION_MIN=force_potion_min;
		this.forcePotion=0;
	}

	public String prendreParole() {
		return getNom() + " : ";
	}
	
	public void parler(String texte) {
		System.out.println("Le druide " + getNom()+ " : « " + texte + "»");
	}
	public void preparerPotion() {
		Random random = new Random();
		forcePotion=random.nextInt((FORCE_POTION_MAX - FORCE_POTION_MIN+1));
		forcePotion+=FORCE_POTION_MIN;
		
		
		if(forcePotion>7) {
			parler("J'ai préparé une super potion de force");
			parler("La potion octroi une force de : " + forcePotion);
		}
		else {
			parler( "Je n'ai pas trouvé tous les ingrédients ma potion est seulement de force : " + forcePotion);
		}		
	}
	
	public void booster(Gaulois gaulois) {
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
