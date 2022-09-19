package be.intecbrussel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;



/**
 *  JPA CRUD Operations 
 * @author Ramesh Fadatare 
 *
 */
public class CRUDOperations {
    public void insertEntity() {
        EntityManager JPAUtil = null;
        assert false;
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = (EntityTransaction) entityManager.getTransaction();
        entityTransaction.begin();

        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");

        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void findEntity() {
        EntityManager JPAUtil = null;
        assert false;
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class, 1);

        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void updateEntity() {
        EntityManager JPAUtil = null;
        assert false;
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, 1);

        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());

        // The entity object is physically updated in the database when the transaction 
        // is committed 
        student.setFirstName("Ram");
        student.setLastName("jadhav");
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeEntity() {
        EntityManager JPAUtil = null;
        assert false;
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, 1);

        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());

        entityManager.remove(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
} 
