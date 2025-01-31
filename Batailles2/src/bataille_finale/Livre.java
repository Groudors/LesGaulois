package bataille_finale;

public interface Livre {
	default void afficherTitre() {
			System.out.println("Astérix");
	}
	default void afficherAuteur() {
			System.out.println("Promotion STRI L3");
	}
}
