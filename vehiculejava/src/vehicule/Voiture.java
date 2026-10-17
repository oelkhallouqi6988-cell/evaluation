package vehicule;


	public class Voiture extends Vehicule {

	    private int nbPlaces;

	    public Voiture(String immatriculation, String marque,
	                   double tarifJournalier, int nbPlaces) {
	        super(immatriculation, marque, tarifJournalier);
	        this.nbPlaces = nbPlaces;
	    }

	    @Override
	    public double calculerCout(int nbJours) {
	        double tarif = tarifJournalier;

	        if (nbPlaces > 5) {
	            tarif += 50;
	        }

	        return tarif * nbJours;
	    }

	    @Override
	    public void afficherDetails() {
	        super.afficherDetails();
	        System.out.println("Nombre de places : " + nbPlaces);
	    }
	}

