package ex3;

public class Client {

	public static void main(String[] args) {

		Vehicule v=new Voiture();
		System.out.println(v.getMarque());
		System.out.println(v.getPrix());
		
		v=new ABS(v);
		System.out.println(v.getMarque());
		System.out.println(v.getPrix());
		
		v=new GPS(v);
		System.out.println(v.getMarque());
		System.out.println(v.getPrix());
		
		
		
		Vehicule m=new Moto();
		System.out.println(m.getMarque());
		System.out.println(m.getPrix());
		
		m=new ABS(m);
		System.out.println(m.getMarque());
		System.out.println(m.getPrix());
		
		m=new GPS(m);
		System.out.println(m.getMarque());
		System.out.println(m.getPrix());
	}
}
