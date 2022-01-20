package Entity;

import javax.persistence.*;

@Entity
@Table(name = "Fournisseur")
public class Fournisseur 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "rs")
	private String rs;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "rue")
	private String rue;
	
	@Column(name = "cp")
	private String cp;
	
	@Column(name = "ville")
	private String ville;
	
	@Column(name = "tel")
	private String tel;
	
	@Column(name = "mail")
	private String mail;
	
	public Fournisseur(){}
	
	public Fournisseur(String s, String n)
	{
		this(s, n, "", "", "", "", "");
	}
	
	Fournisseur(String s, String n, String r, String c, String v, String t, String m)
	{
		rs = s;
		nom = n;
		rue = r;
		cp = c;
		ville = v;
		tel = t;
		mail = m;
	}
}
