package Entity;

import javax.persistence.*;

@Entity
@Table(name = "Produit")
@Inheritance(strategy = InheritanceType.JOINED)
public class Produit 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "refproduit")
	protected String ref;
	
	@Column(name = "nomproduit")
	protected String nom;
	
	@Column(name = "descproduit")
	protected String description;
	
	@Column(name = "prixventeuht")
	protected double prixventeUHT;
	
	
	public Produit(){}
	
	public Produit(String r, String n, String d, double p)
	{
		ref = r;
		nom = n;
		description = d;
		prixventeUHT = p;
	}
}
