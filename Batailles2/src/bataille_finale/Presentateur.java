package bataille_finale;

public interface Presentateur extends Livre, Narrateur{
	
	public default void afficherTitre() {
		Livre.super.afficherTitre();
		Narrateur.super.affichertitre();
	}

}
