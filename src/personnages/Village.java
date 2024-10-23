
package personnages;

public class Village {

	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public String getNom() {
		return nom;
	}
	public Chef getChef() {
		return chef;
	}

	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
	}
	
	public Gaulois trouverHabitant(int ref) {
		return villageois[ref];
	}

	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le " + getNom() + " du chef " + getChef() + " vivent les légendaires gaulois :");
		for (int i=0; i<nbVillageois;i++) {
			System.out.println("-" + villageois[i]);
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//e) le tableau à une taille de 0 à 29 l'emplacement 30 est donc inutilisable.
		Chef abararacourcix = new Chef("Abararacourcix",6,village);
		village.setChef(abararacourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//e) asterix est assigné à villageois[0], villageois[1] est donc vide ce qui explique le null
		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
	}


}
