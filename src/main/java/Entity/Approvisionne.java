package Entity;

import javax.persistence.*;

@Entity
@Table(name = "Approvisionne")
public class Approvisionne 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "reffour")
	private String reffour;
	
	@Column(name = "prixfour")
	private double prixfour;
	
	public Approvisionne(){}
	
	public Approvisionne(String r, double p)
	{
		reffour = r;
		prixfour = p;
	}
}
