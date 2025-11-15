package com.example.api;

import com.example.model.Person;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/**
 * Interface de service web SOAP pour les opérations de base.
 * Définit le contrat du service avec l'espace de noms spécifique.
 */
@WebService(targetNamespace = "http://api.cxf.acme.com/")
public interface HelloService {

    /**
     * Opération permettant d'envoyer un message de salutation personnalisé.
     * @param name Le nom de la personne à saluer
     * @return Un message de bienvenue formaté
     */
    @WebMethod(operationName = "SayHello")
    @WebResult(name = "greeting")
    String sayHello(@WebParam(name = "name") String name);

    /**
     * Recherche et retourne les informations d'une personne selon son identifiant.
     * @param id L'identifiant unique de la personne recherchée
     * @return L'objet Person contenant les données associées
     */
    @WebMethod(operationName = "FindPerson")
    @WebResult(name = "person")
    Person findPersonById(@WebParam(name = "id") String id);
}
