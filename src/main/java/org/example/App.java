package org.example;

import org.example.crud.ClientCrudService;
import org.example.crud.PlanetCrudService;
import org.example.migration.FlywayMigration;
import org.example.model.Client;
import org.example.model.Planet;

public class App {
    public static void main(String[] args) {
        FlywayMigration flywayMigration = new FlywayMigration();
        flywayMigration.migrate();


        ClientCrudService clientCrudService = new ClientCrudService();
        PlanetCrudService planetCrudService = new PlanetCrudService();

        Client client = new Client();
        client.setName("Test Client");
        System.out.println("client = " + client);
        clientCrudService.save(client);

        Long id = client.getId();

        client = clientCrudService.findById(id);
        System.out.println("client = " + client);

        client.setName("Updated Test Client");
        clientCrudService.update(client);
        client = clientCrudService.findById(id);
        System.out.println("client = " + client);

        clientCrudService.delete(client);
        client = clientCrudService.findById(id);
        System.out.println("client = " + client);


        Planet planet = new Planet();
        planet.setId("PLU");
        planet.setName("Pluto");
        System.out.println("planet = " + planet);
        planetCrudService.save(planet);

        String planetId = planet.getId();

        planet = planetCrudService.findById(planetId);
        System.out.println("planet = " + planet);

        planet.setName("Updated Pluto");
        planetCrudService.update(planet);
        planet = planetCrudService.findById(planetId);
        System.out.println("planet = " + planet);

        planetCrudService.delete(planet);
        planet = planetCrudService.findById(planetId);
        System.out.println("planet = " + planet);
    }
}
