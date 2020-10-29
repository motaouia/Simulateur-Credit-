package metier;

public class TestMetier {

	public static void main(String[] args) {
		ICreditMetier metier = new CreditMetierImpl();
		System.out.println(metier.calculMensualitee(200000, 240, 4.5));

	}

}
