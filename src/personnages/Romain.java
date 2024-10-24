package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

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
		int forceSur = force;
		force -= forceCoup;
		assert forcePositif();
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		assert force< forceSur;

	}
	
	public boolean forcePositif() {
		return force >=0;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Romain [nom=" +nom + ", force=" + force + "]";
				
	}

	public static void main(String[] args) {
		// Verification de prendreParole
		Romain minus =  new Romain ("Minus", 6);
		System.out.println(minus.prendreParole());
		
		// Verification de parler
		minus.parler("Bonjour tout le monde !");
		
		// Verification de recevoir coup
		minus.recevoirCoup(7);
		
		
	}

}
