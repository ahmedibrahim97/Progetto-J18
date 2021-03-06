
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import magazinestore.entity.Utenti;

public class CategoriaTest {
    public static void main(String args[]) {
        Utenti utente1 = new Utenti();
        utente1.setEmail("oggi@outlook.it");
        utente1.setFullName("Prova 3");
        utente1.setPassword("ssd78s");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Progetto-J18");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(utente1);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("A Users object was persisted");
    }
}
