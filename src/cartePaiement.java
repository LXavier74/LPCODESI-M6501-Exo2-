
public abstract class cartePaiement {

	
public double payeAchat(double montant)
{
	return montant;
}
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
