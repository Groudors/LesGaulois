package personnages;

public class PotionNonPreteException extends Exception {
	public PotionNonPreteException() {
        super("La potion n'est pas prête !");
    }

}
