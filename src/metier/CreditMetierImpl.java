package metier;

public class CreditMetierImpl implements ICreditMetier {

	@Override
	public double calculMensualitee(double montant, int duree, double taux) {
		double fact1 = (montant*taux) / (12* 100);
		double fact2 = 1- Math.pow(1 + (taux /(12*100)), (-1) * duree);
		return fact1 / fact2;
		
	}

}
