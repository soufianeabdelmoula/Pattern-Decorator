package ex3;

public abstract class OptionDec extends Vehicule{

	
	protected Vehicule vehicule;
	public OptionDec(Vehicule vehicule)
	{
		this.vehicule=vehicule;
	}
	
	public abstract String getMarque();

}
