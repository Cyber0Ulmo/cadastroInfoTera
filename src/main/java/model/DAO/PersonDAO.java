package model.DAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import model.Person;

import java.util.List;

public class PersonDAO {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(Person person) {
        em.persist(person);
    }

    public Person findById(Integer id) {
        return em.find(Person.class, id);
    }

    public List<Person> findByName(String name) {
        return em.createQuery("SELECT p FROM Person p WHERE p.name LIKE :name", Person.class)
                .setParameter("name", "%" + name + "%")
                .getResultList();
    }

    @Transactional
    public void delete(Person person) {
        em.remove(em.contains(person) ? person : em.merge(person));
    }
}

