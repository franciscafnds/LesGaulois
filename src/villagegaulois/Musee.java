package villagegaulois;

import personnages.Equipement;

public class Musee {

	private Equipement[] trophees = new Equipement[200];
	private int nbTrophee = 0;

	public Musee(Equipement[] trophees, int nbTrophee) {
		super();
		this.trophees = trophees;
		this.nbTrophee = nbTrophee;
	}

}
