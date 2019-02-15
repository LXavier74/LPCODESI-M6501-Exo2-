
public class carteCredit extends cartePaiement {
	protected double plafond;
	protected double encours;
	
	public boolean autorisePaiement(double montant)
	{
		boolean result;
		result=false;
		if (montant > 0)
		{
			result = true;
		}
		return result;
	}
}
