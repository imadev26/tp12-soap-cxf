package com.example.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Classe représentant une personne avec ses attributs de base.
 * Annotée pour la sérialisation/désérialisation XML via JAXB.
 */
@XmlRootElement(name = "Person")
public class Person {
    private String id;
    private String name;
    private int age;

    /**
     * Constructeur par défaut sans paramètres.
     * Obligatoire pour la sérialisation JAXB.
     */
    public Person() {}

    /**
     * Constructeur avec paramètres pour initialiser tous les champs.
     * @param id Identifiant unique de la personne
     * @param name Nom complet de la personne
     * @param age Âge de la personne
     */
    public Person(String id, String name, int age) {
        this.id = id; this.name = name; this.age = age;
    }

    @XmlElement public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    @XmlElement public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @XmlElement public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}