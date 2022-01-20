package Domain;

public class Fournisseur 
{
	private int id;
	private String rs;
	private String nom;
	private String rue;
	private String cp;
	private String ville;
	private String tel;
	private String mail;
	
	Fournisseur(){}
	
	Fournisseur(String s, String n)
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
