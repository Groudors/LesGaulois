package personnages;

public abstract class Personnage {
	protected String nom;
	protected int force;

	public Personnage(String nom) {
		this.nom = nom;

	}
	
	public abstract String getNom();
	
	public abstract void parler(String texte);

	public abstract String prendreParole();
}
