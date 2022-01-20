package Entity;

import javax.persistence.*;

@Entity
@Table(name = "ProduitAppro")
public class ProduitAppro extends Produit
{
	@Column(name = "prixachatuht")
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
	
	public ProduitAppro(Produit p, double pa)
	{
		this(p.ref, p.nom, p.description, p.prixventeUHT, pa);
		
	}
}
