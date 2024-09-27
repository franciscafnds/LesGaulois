package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	// Getter pour le nom
	public String getNom() {
		return nom;
	}

	// Methode pour parler
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	// Methode pour frapper un ennemi
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	private char[] recevoirCoup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		// Verification de prendreParole
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.prendreParole());

		// Verification de parler
		asterix.parler("Bonjour tout le monde !");

		// Verification de frapper
		asterix.frapper("un romain");

	}


}
