package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert forcePositif();
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
		//assert forcePositif();
		if (force > 0) {  
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		assert force< forceSur;

	}

	
	private boolean forcePositif() {
		return force >=0;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
		System.out.println("Le soldat " + nom + " est déjà bien protégé !");
		break;
		case 1 :
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà "+equipement + " !");
			}else {
				equipements[1] = equipement ;
				nbEquipement ++;
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
			}
			break;
		default :
			equipements[0] = equipement ;
			nbEquipement ++;
			System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
			break;
		}
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
		// Verification equipement
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		
	}

}
