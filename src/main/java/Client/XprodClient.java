package Client;

import java.util.ArrayList;

import javax.persistence.*;

import Entity.*;

public class XprodClient 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("XprodManager");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try 
		{
			txn.begin();
			
			Produit prodt = new Produit("tableabc", "Table", "Grande table rectangulaire (8 places) en bois massif", 200);
			Produit prodc = new Produit("chaiseabc", "Chaise", "Chaise confortable rembourrée", 50);
			Produit prodb = new Produit("bureauabc", "Bureau", "Bureau avec rangements", 150);
			Produit prodl = new Produit("litabc", "Lit", "Lit simple", 120);
			Produit prodll = new Produit("llitabc", "LLit", "Lit double", 250);
			
			
			
			
			Fournisseur fourtc = new Fournisseur("MTC", "Meubles Table Chaise");
			Fournisseur fourm = new Fournisseur("M", "Meubles");
			
			
			
			
			ProduitAppro prodat = new ProduitAppro(prodt, 150);
			ProduitAppro prodac = new ProduitAppro(prodc, 30);
			ProduitAppro prodall = new ProduitAppro(prodll, 160);
			
			
			
			
			Approvisionne approt = new Approvisionne("tablemtc", 150);
			Approvisionne approc = new Approvisionne("chaisemtc", 40);
			Approvisionne approll = new Approvisionne("llitm", 180);
			
			
			
			
			ProduitFab prodfb = new ProduitFab(prodb, 50);
			ProduitFab prodfl = new ProduitFab(prodl, 80);
			
		
			
			LigneCmd lcmdt1 = new LigneCmd(1, "18/01/2022", 150);
			LigneCmd lcmdt2 = new LigneCmd(10, "18/01/2022", 150);
			LigneCmd lcmdt3 = new LigneCmd(100, "18/01/2022", 150);
			LigneCmd lcmdc1 = new LigneCmd(200, "18/01/2022", 30);
			LigneCmd lcmdll1 = new LigneCmd(4, "18/01/2022", 160);
			
			
			ArrayList<LigneCmd> liste1 = new ArrayList<LigneCmd>();
			liste1.add(lcmdt1);
			liste1.add(lcmdll1);
			
			ArrayList<LigneCmd> liste2 = new ArrayList<LigneCmd>();
			liste2.add(lcmdt2);
			
			ArrayList<LigneCmd> liste3 = new ArrayList<LigneCmd>();
			liste3.add(lcmdt3);
			liste3.add(lcmdc1);
			
			Commande com1 = new Commande("14/01/2022", 30, liste1);
			Commande com2 = new Commande("15/01/2022", 50, liste2);
			Commande com3 = new Commande("16/01/2022", 300, liste3);
			
			/*em.persist(prodt);
			em.persist(prodc);
			em.persist(prodb);
			em.persist(prodl);
			em.persist(prodll);
			*/
			em.persist(fourtc);
			em.persist(fourm);
			
			em.persist(prodat);
			em.persist(prodac);
			em.persist(prodall);
			
			em.persist(approt);
			em.persist(approc);
			em.persist(approll);
			
			em.persist(prodfb);
			em.persist(prodfl);
			
		/*	em.persist(lcmdt1);
			em.persist(lcmdt2);
			em.persist(lcmdt3);
			em.persist(lcmdc1);
			em.persist(lcmdll1);*/
			
			em.persist(com1);
			//em.persist(com2);
			//em.persist(com3);
			
			
			
			txn.commit();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
