package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}

	}
	
	@Override
	public String toString() {
		return "Romain [nom=" +nom + ", force=" + force + "]";
				
	}

	public static void main(String[] args) {
		// Verification de prendreParole
		Romain minus =  new Romain ("Minus", 5);
		System.out.println(minus);
		
		// Verification de parler
		minus.parler("Bonjour tout le monde !");
		
		// Verification de recevoir coup
		minus.recevoirCoup(7);
		
	}

}
