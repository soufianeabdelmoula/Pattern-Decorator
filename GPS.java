package ex3;

public class GPS extends OptionDec{

	
	public GPS(Vehicule vehicule) {
		super(vehicule);
	}

	public double getPrix() {
		return 400+vehicule.getPrix();
	}

	public String getMarque() {
		return vehicule.getMarque()+" Avec l'option du  GPS";
	}

}
