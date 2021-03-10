package magus.dao;

import magus.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDAO {
    private static SessionFactory factory;

    public UserDAO() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public void createUser(User user){
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(user);

        transaction.commit();
        session.close();
    }
}
















