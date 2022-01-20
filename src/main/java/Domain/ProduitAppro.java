package Domain;

public class ProduitAppro extends Produit
{
	private double prixachatUHT; // comprends pas
	
	ProduitAppro()
	{
		super();
	}
	
	ProduitAppro(String r, String n, String d, double pv, double pa)
	{
		super(r, n, d, pv);
		prixachatUHT = pa;
	}
}
