
public class carteCredit extends cartePaiement {
	protected double plafond;
	protected double encours;
	
	public boolean autorisePaiement(double montant)
	{
	return (encours+montant <=plafond);
	}
}
