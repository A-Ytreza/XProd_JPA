package Entity;

import javax.persistence.*;

@Entity
@Table(name = "ProduitFab")
public class ProduitFab extends Produit
{
	@Column(name = "nbheures")
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
	
	public ProduitFab(Produit p, double h)
	{
		this(p.ref, p.nom, p.description, p.prixventeUHT, h);
	}
}
