package module12.dao;

import module12.model.Planet;
import module12.service.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PlanetDao {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    // Create
    public void save(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(planet);
            tx.commit();
        }
    }

    // Read
    public Planet findById(String id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Planet.class, id);
        }
    }

    // Update
    public void update(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(planet);
            tx.commit();
        }
    }

    // Delete
    public void delete(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.remove(planet);
            tx.commit();
        }
    }
}
