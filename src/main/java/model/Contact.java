package model;

import jakarta.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @Column(name = "nm_contact", length = 45, nullable = false)
    private String nmContact;

    @Column(name = "nr_telephone", length = 45, nullable = false)
    private String nrTelephone;

    @Column(name = "nm_email", length = 45, nullable = false)
    private String nmEmail;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNmContact() {
        return nmContact;
    }

    public void setNmContact(String nmContact) {
        this.nmContact = nmContact;
    }

    public String getNrTelephone() {
        return nrTelephone;
    }

    public void setNrTelephone(String nrTelephone) {
        this.nrTelephone = nrTelephone;
    }

    public String getNmEmail() {
        return nmEmail;
    }

    public void setNmEmail(String nmEmail) {
        this.nmEmail = nmEmail;
    }
}
