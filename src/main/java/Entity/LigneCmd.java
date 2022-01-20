package Entity;

import javax.persistence.*;

@Entity
@Table(name = "LigneCmd")
public class LigneCmd 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "qte")
	private int qte;
	
	@Column(name = "dateliv")
	private String dateliv;
	
	@Column(name = "prixUHT")
	private double prixUHT;
	
	
	@ManyToOne
	@JoinColumn(name = "commande_id")
	private Commande commande;
	
	LigneCmd(){}
	
	public LigneCmd(int q, String d, double p)
	{
		qte = q;
		dateliv = d;
		prixUHT = p;
	}
	
	public void setcommande(Commande c)
	{
		commande = c;
	}
}
