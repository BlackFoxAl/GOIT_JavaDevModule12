package module12.dao;

import module12.model.Client;
import module12.service.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientDao {
    private final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    // Create
    public void save(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(client);
            tx.commit();
        }
    }

    // Read
    public Client findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Client.class, id);
        }
    }

    // Update
    public void update(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(client);
            tx.commit();
        }
    }

    // Delete
    public void delete(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.remove(client);
            tx.commit();
        }
    }
}
