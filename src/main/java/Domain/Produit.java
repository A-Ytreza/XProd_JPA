package Domain;

public class Produit 
{
	private int id;
	private String ref;
	private String nom;
	private String description;
	private double prixventeUHT;
	
	
	Produit(){}
	
	Produit(String r, String n, String d, double p)
	{
		ref = r;
		nom = n;
		description = d;
		prixventeUHT = p;
	}
}
