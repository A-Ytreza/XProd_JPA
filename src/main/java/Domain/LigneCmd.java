package Domain;


public class LigneCmd 
{
	
	private int id;
	private int qte;
	private String dateliv;
	private double prixUHT;
	
	LigneCmd(){}
	
	LigneCmd(int q, String d, double p)
	{
		qte = q;
		dateliv = d;
		prixUHT = p;
	}
}
