# TP12 SOAP CXF

## Description
Projet de travaux pratiques démontrant l'implémentation d'un service web SOAP avec Apache CXF et JAX-WS.

## Technologies utilisées
- Java
- Apache CXF
- JAX-WS (Jakarta Web Services)
- JAXB (Jakarta XML Binding)
- Maven

## Structure du projet
```
src/main/java/com/example/
├── api/            # Interfaces de service
├── impl/           # Implémentations des services
├── model/          # Classes de modèle de données
├── client/         # Client de démonstration
├── Server.java     # Serveur SOAP
└── App.java        # Application principale
```

## Fonctionnalités
- Service web SOAP avec deux opérations :
  - `sayHello` : Envoie un message de salutation personnalisé
  - `findPersonById` : Recherche une personne par son identifiant

## Démarrage du serveur
1. Compiler le projet avec Maven :
   ```bash
   mvn clean compile
   ```

2. Lancer le serveur :
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.Server"
   ```

3. Le service sera disponible à : `http://localhost:8080/services/hello`
4. WSDL accessible à : `http://localhost:8080/services/hello?wsdl`

## Utilisation du client
Exécuter le client de démonstration :
```bash
mvn exec:java -Dexec.mainClass="com.example.client.ClientDemo"
```

## Auteur
Projet académique - TP12
