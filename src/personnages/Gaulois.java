package personnages;

public class Gaulois {

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force, int effetPotion) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getEffetPotion() {
		return effetPotion;
	}

	public void name(String texte) {
		prendreParole();

	}

	private static void prendreParole() {
		// TODO Auto-generated method stub

	}

}
