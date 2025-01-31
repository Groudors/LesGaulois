package personnages;
import personnages.Personnage;

public class Gaulois extends Combattant{
	private int effetPotion = 1;
	
	public Gaulois(String nom,int force) {
		super(nom,force);
	}
	
	public String getNom() {
		return nom;
	}
	
	public String prendreParole() {
		return getNom() + " : ";
	}
	
	public void parler(String texte) {
		System.out.println("Le gaulois " + getNom()+ " : « " + texte + "»");
	}

	public int getPotion() {
		return effetPotion;
	}
	
	@Override
	public void frapper(Combattant romain) {
		System.out.println(getNom() + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoir_coup((force/3)*effetPotion);
		effetPotion-=1;
		if (effetPotion<1) {
			effetPotion=1;
		}
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
		parler("Merci druide, je sens que ma force est décuplée.");
	}

	@Override
	public void recevoir_coup(int coup) {
		if(coup<0) {
			coup=0;
		}
	
		this.force -= coup;
		if (force<=0) {
			force = 0;
			parler("J'abandonne");
		}
		else {
			parler("Aïe");
		}
		
	}

}
