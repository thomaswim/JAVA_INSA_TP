package partie4;

public class VehiculePrioritaire extends Voiture34 {
	private boolean gyrophare;
	
	
	
	public VehiculePrioritaire() {
		super(4);
	}
	






	public void allumeGyrophare() {
		gyrophare = true;
		super.accelere(10);
	}
	
	
}
