package com.sustav.jpa;

import com.sustav.jpa.entity.Student;
import com.sustav.jpa.util.JPAUtility;

import javax.persistence.EntityManager;

/**
 * @author Anton Sustavov
 * @since 2019/12/24
 */
public class JpaMain {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtility.getEntityManager();
        entityManager.getTransaction().begin();
        Student employee = new Student("Mahesh", "Varanasi");
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        JPAUtility.close();
        System.out.println("Entity saved.");
    }
}
