package personnages;

public class Romain extends Combattant{
	private Equipement[] equipement=new Equipement[2] ;
	private int nbEquipement =0;
	
	public Romain(String nom,int force) {
		super(nom,force);
	}
	public String getNom() {
		return nom;
	}
	


	public String prendreParole() {
		return getNom() + " : ";
	}
	
	public void parler(String texte) {
		System.out.println("Le romain " + getNom()+ " : « " + texte + "»");
	}
	
	@Override
	public void recevoir_coup(int coup) {
		for(int i=0;i<2;i++) {
			if(equipement[i]!= null && equipement[i].getNom()=="casque") {
				coup-=5;
			}
			if(equipement[i]!= null && equipement[i].getNom()=="bouclier") {
				coup-=8;
			}
		}
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
	
	public void conditionEquipement(Equipement equiper) {
		if(equipement[0]==equiper || equipement[1]==equiper){
			System.out.println("Le soldat "+nom + " possède déjà un "+ equiper.getNom());
		}
		else {
			if(equipement[0]==null) {
				equipement[0]=equiper;
				nbEquipement++;
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equiper.getNom() + ".");

			}
			else {
				equipement[1]=equiper;
				nbEquipement++;
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equiper.getNom() + ".");			
			}
		}
	}
	
	public void sEquiper(Equipement equiper) {
		if (equipement[0]!=null && equipement[1]!= null) {
			System.out.println("Le soldat "+nom + " est déjà bien protégé !");
		}
		else {
			switch (equiper) {
			case CASQUE:
				conditionEquipement(equiper);
				break;
				
			case BOUCLIER:
				conditionEquipement(equiper);
				break;
			}
		}
	}
	@Override
	public void frapper(Combattant gaulois) {
		System.out.println("Le soldat " +getNom() + " frappe " + gaulois.getNom() + " de toutes ses forces.");
		gaulois.recevoir_coup(force);
		
	}
		
	}
	
	
	
	