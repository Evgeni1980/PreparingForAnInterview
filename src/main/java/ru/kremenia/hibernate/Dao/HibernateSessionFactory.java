package ru.kremenia.hibernate.Dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSessionFactory {

    private static SessionFactory sessionFactory = buildSessionFactory();

    protected static SessionFactory buildSessionFactory() {
        // SessionFactory устанавливается один раз для приложения!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // настраивает параметры из hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry)
                    .buildMetadata().buildSessionFactory();
        }
        catch (Exception e){
            StandardServiceRegistryBuilder.destroy( registry );
            throw new ExceptionInInitializerError("Первоначальная SessionFactory не удалась" + e);
        }
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown(){
        // Закрываем кеши и пулы соединений
        getSessionFactory().close();
    }

}
