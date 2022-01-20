package Domain;

import java.util.ArrayList;
import java.util.List;

public class Commande 
{
	private int id;
	private String date;
	private double fraisport;
	
	private List<LigneCmd> lignecmd = new ArrayList<LigneCmd>();
	
	Commande(){}
	
	Commande(String d, double f)
	{
		date = d;
		fraisport = f;
	}
	
	Commande(String d, double f, List<LigneCmd> liste)
	{
		this(d, f);
		lignecmd = liste;
	}
}
