package model;

import jakarta.persistence.*;

@Entity
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @Column(name = "nr_document", length = 45, nullable = false)
    private String nrDocument;

    @Column(name = "tp_document", length = 45, nullable = false)
    private String tpDocument;

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

    public String getNrDocument() {
        return nrDocument;
    }

    public void setNrDocument(String nrDocument) {
        this.nrDocument = nrDocument;
    }

    public String getTpDocument() {
        return tpDocument;
    }

    public void setTpDocument(String tpDocument) {
        this.tpDocument = tpDocument;
    }
}
