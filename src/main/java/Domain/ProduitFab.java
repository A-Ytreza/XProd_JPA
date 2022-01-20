package Domain;

public class ProduitFab extends Produit
{
	private double nbheures;
	
	ProduitFab()
	{
		super();
	}
	
	ProduitFab(String r, String n, String d, double pv, double h)
	{
		super(r, n, d, pv);
		nbheures = h;
	}
}
