package personnages;
import personnages.Personnage;

public abstract class Combattant extends Personnage{
	protected int force;
	
	public Combattant(String nom, int force) {
		super(nom);
		this.force=force;
		assert force>0;
	}
	public abstract void recevoir_coup(int coup);

	public abstract void frapper(Combattant combattant);

}
