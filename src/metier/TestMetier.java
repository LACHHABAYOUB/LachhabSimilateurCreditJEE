package metier;

public class TestMetier {

	public static void main(String[] args) {
		CreditMetier metier=new CreditMetier();
		double m=metier.calculMensulatie(200000, 240, 4.5);
		System.out.println("resultat"); //test Unitaire!
		System.out.println(m);
	}

}
