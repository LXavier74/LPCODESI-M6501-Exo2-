
public class carteDebit {

	public boolean autorisePaiement(double montant)
	{
		return (compteAssocie.solde>=montant);
	}
}
