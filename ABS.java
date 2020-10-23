package ex3;

public class ABS extends OptionDec{

	public ABS(Vehicule vehicule) {
	super(vehicule);
	}

	public double getPrix() {
		return 500+vehicule.getPrix();
	}

	public String getMarque() {
		return vehicule.getMarque()+" Avec l'option ABS";
	}
}
