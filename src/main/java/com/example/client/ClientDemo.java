package com.example.client;

import com.example.api.HelloService;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import java.net.URL;

/**
 * Client de démonstration pour tester le service web SOAP.
 * Effectue des appels aux opérations exposées par le service.
 */
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        // Récupération du WSDL du service distant
        URL wsdl = new URL("http://localhost:8080/services/hello?wsdl");
        
        // Définition du QName avec le namespace et le nom du service
        QName qname = new QName("http://api.cxf.acme.com/", "HelloService");
        
        // Création du service à partir du WSDL
        Service svc = Service.create(wsdl, qname);
        
        // Obtention du port pour effectuer les appels
        HelloService port = svc.getPort(HelloService.class);

        // Test de l'opération sayHello
        System.out.println(port.sayHello("ClientJava"));
        
        // Test de l'opération findPersonById et affichage du nom
        System.out.println(port.findPersonById("P-777").getName());
    }
}
