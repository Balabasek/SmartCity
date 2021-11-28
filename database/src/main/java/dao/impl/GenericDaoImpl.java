package dao.impl;

import dao.GenericDao;
import org.hibernate.Session;
import util.HibernateSessionFactoryUtil;

import java.util.List;

public class GenericDaoImpl<T> implements GenericDao<T> {

    private  Class<T> type;

    public GenericDaoImpl(Class<T> type){
        this.type = type;
    }
    @Override
    public void create(T object) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.save(object);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(T object) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.update(object);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(T object) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.delete(object);
            session.getTransaction().commit();
        }
    }

    @Override
    public List<T> findAll() {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            return session.createQuery("from " + type.getSimpleName(), type).getResultList();
        }
    }

}
