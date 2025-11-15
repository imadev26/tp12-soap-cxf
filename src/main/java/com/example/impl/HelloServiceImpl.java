package com.example.impl;

import com.example.api.HelloService;
import com.example.model.Person;
import jakarta.jws.WebService;

/**
 * Implémentation concrète du service web HelloService.
 * Cette classe fournit la logique métier pour chaque opération définie dans l'interface.
 */
@WebService
public class HelloServiceImpl implements HelloService {

    /**
     * Génère un message de salutation personnalisé.
     * Si le nom fourni est null, utilise "inconnu" par défaut.
     */
    @Override
    public String sayHello(String name) {
        return "Bonjour, " + (name == null ? "inconnu" : name);
    }

    /**
     * Retourne un objet Person basé sur l'identifiant fourni.
     * Note : Cette version utilise des données fictives à des fins de démonstration.
     */
    @Override
    public Person findPersonById(String id) {
        return new Person(id, "Ada Lovelace", 36); // Données de test statiques
    }
}