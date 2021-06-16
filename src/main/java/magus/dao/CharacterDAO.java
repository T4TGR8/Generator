package magus.dao;

import magus.model.Character;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CharacterDAO implements ICharacterDAO{
    private static SessionFactory factory;

    public CharacterDAO() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public void createCharacter(Character character){
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(character);

        transaction.commit();
        session.close();
    }
}
