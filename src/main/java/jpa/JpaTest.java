package jpa;

import kanban.Fiche;
import kanban.Utilisateur;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class JpaTest {
	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("mysql");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			test.createUser();
			test.listUser();

		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		test.listUser();

		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}

	private void createUser() {
		List<Fiche> ficheList1 = new ArrayList<Fiche>();
		List<Fiche> ficheList2 = new ArrayList<Fiche>();
		List<Fiche> ficheList3 = new ArrayList<Fiche>();
		List<Fiche> ficheList4 = new ArrayList<Fiche>();

		//int numOfUser = manager.createQuery("Select a From UtilisateurInfo a", UtilisateurInfo.class).getResultList().size();
		manager.persist(new Utilisateur(1, "Jakab", "Gipsz",ficheList1));
		manager.persist(new Utilisateur(2,"Captain", "Nemo",ficheList2));
		manager.persist(new Utilisateur(3, "Jakab", "Gipsz",ficheList3));
		manager.persist(new Utilisateur(4,"Captain", "Nemo",ficheList4));
	}

	private void listUser() {
		List<Utilisateur> resultList = manager.createQuery("Select a From UtilisateurInfo a", Utilisateur.class).getResultList();
		System.out.println("num of users:" + resultList.size());
		for (Utilisateur next : resultList) {
			String next2 = next.toString();
			System.out.println("next employee: " + next2);
		}
	}
}
