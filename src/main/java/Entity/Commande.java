package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Commande")
public class Commande // implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "frais")
	private double fraisport;
	
	@OneToMany(mappedBy = "commande", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	private List<LigneCmd> lignecmd = new ArrayList<LigneCmd>();
	
	Commande(){}
	
	Commande(String d, double f)
	{
		date = d;
		fraisport = f;
	}
	
	public Commande(String d, double f, List<LigneCmd> liste)
	{
		this(d, f);
		lignecmd = liste;
		
		for (LigneCmd l : liste)
		{
			l.setcommande(this);
		}
	}
}
