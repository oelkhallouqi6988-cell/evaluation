package vehicule;


	public class Main {

	    public static void main(String[] args) {

	        // 1. Creer deux clients
	        Client c1 = new Client(1, "Elkhallouqi", "Oussama");
	        Client c2 = new Client(2, "Amrani", "Youssef");

	        // 2. Creer deux voitures et une moto
	        Voiture v1 = new Voiture("12345-A-1", "Dacia", 300, 5);
	        Voiture v2 = new Voiture("23456-B-2", "Mercedes", 400, 7);
	        Moto m1 = new Moto("34567-C-3", "Yamaha", 150, 125);

	        // 3. Stocker les vehicules dans un tableau
	        Vehicule[] vehicules = {v1, v2, m1};

	        // 4. Afficher les details de chaque vehicule
	        System.out.println("===== LISTE DES VEHICULES =====");

	        for (int i = 0; i < vehicules.length; i++) {
	            System.out.println("\nVehicule " + (i + 1));
	            vehicules[i].afficherDetails();
	            System.out.println("Cout pour 2 jours : "
	                    + vehicules[i].calculerCout(2) + " DH");
	        }

	        // 5. Creer trois locations
	        Location l1 = new Location(c1, v1, 3);
	        Location l2 = new Location(c2, v2, 2);
	        Location l3 = new Location(c1, m1, 6);

	        // 6. Stocker les locations dans un tableau
	        Location[] locations = {l1, l2, l3};

	        // 7. Afficher les recapitulatifs
	        System.out.println("\n===== LISTE DES LOCATIONS =====");

	        double total = 0;

	        for (int i = 0; i < locations.length; i++) {
	            locations[i].afficherRecapitulatif();
	            total += locations[i].calculerMontant();
	        }

	        // 8. Afficher le montant total
	        System.out.println("\n===== TOTAL GENERAL =====");
	        System.out.println("Montant total de toutes les locations : "
	                + total + " DH");
	    }
	
}
