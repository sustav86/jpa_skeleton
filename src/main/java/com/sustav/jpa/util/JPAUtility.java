package com.sustav.jpa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Anton Sustavov
 * @since 2019/12/24
 */
public class JPAUtility {
    private static final EntityManagerFactory emFactory;
    static {
        emFactory = Persistence.createEntityManagerFactory("jpa");
    }
    public static EntityManager getEntityManager(){
        return emFactory.createEntityManager();
    }
    public static void close(){
        emFactory.close();
    }
}
