package controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import model.DAO.PersonDAO;
import model.Person;
import model.Contact;
import model.Document;

import java.util.List;

@Named
@RequestScoped
public class PersonController {

    private Person person = new Person();
    private List<Person> persons;
    private String searchName;

    private PersonDAO personDAO = new PersonDAO();

    // Ações
    public void search() {
        persons = personDAO.findByName(searchName);
    }

    public void savePerson() {
        personDAO.save(person);
    }

    public void deletePerson(Person person) {
        personDAO.delete(person);
    }

    // Getters and Setters
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }
}
