package com.tpe.hotelManagementSystem.config;

import com.tpe.hotelManagementSystem.domain.Hotel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static final SessionFactory sessionFactory;
    static {
        try{
            Configuration configuration = new Configuration().
                    configure("hibernate.cfg.xml");
                    //addAnnotatedClass(Hotel.class).addAnnotatedClass(Room.class);     //pomxml de mapping yaptıgımız için kullanmıyoruz.
            sessionFactory=configuration.buildSessionFactory();
        }catch (Throwable ex){
            System.err.println("Initial SessionFactory is failed."+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    //getSessionFactory method
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    //sessionFactory shutDown
    public static void shutDown(){
        getSessionFactory().close();
    }

    //session close
    public static void closeSession(Session session){
        if(session != null && session.isOpen()){
            session.close();
        }
    }

}
