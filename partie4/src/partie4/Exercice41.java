package partie4;

public class Exercice41 {
	
	

	public static void main(String[] args) {
		VehiculePrioritaire VehiculePrioriatire1 = new VehiculePrioritaire () ;
		VehiculePrioriatire1.setNom('c');
		VehiculePrioriatire1.allumeGyrophare();
		VehiculePrioriatire1.accelere(20);
		
		for (int i =0; i<Voiture34.getNbVoitures();i++) {
			System.out.println("Voiture numéro "+(i+1)+" de nom : "+Voiture34.getListeVoitures()[i].getNom());
		}
		System.out.println("Vitesse : "+ VehiculePrioriatire1.getVitesse()+" km/h");
	}

}
