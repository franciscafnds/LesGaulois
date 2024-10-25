package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion = 1;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	// Getter pour le nom
	public String getNom() {
		return nom;
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";

	}

	
	// Methode pour parler
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}

	// Methode pour frapper un ennemi
//	public void frapper(Romain romain) {
//		
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup(force / 3 * effetPotion );
//	}
//	

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] loot = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; loot != null && i < loot.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = loot[i];
		}
	}

//	@Override
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
//	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois decuplée");

	}

	public static void main(String[] args) {
		// Verification de prendreParole
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);

		// Verification de parler
		asterix.parler("Bonjour tout le monde !");

		// Verification de frapper
		Romain minus = new Romain("Minus", 5);

	}

}
