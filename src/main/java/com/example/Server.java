package com.example;

import com.example.impl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Classe principale pour démarrer le serveur SOAP.
 * Configure et lance le service web utilisant Apache CXF.
 */
public class Server {
    public static void main(String[] args) {
        // Configuration de l'adresse d'exposition du service
        String address = "http://localhost:8080/services/hello";
        
        // Création et configuration de la factory pour le serveur JAX-WS
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloServiceImpl.class);
        factory.setAddress(address);
        
        // Démarrage du service web
        factory.create();
        
        // Affichage de l'URL du WSDL pour information
        System.out.println("WSDL: " + address + "?wsdl");
    }
}