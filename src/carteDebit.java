
public class carteDebit extends cartePaiement{
	protected compte compteAssocie; 

	public boolean autorisePaiement(double montant)
	{
		return (compteAssocie.solde>=montant);
	}
}
