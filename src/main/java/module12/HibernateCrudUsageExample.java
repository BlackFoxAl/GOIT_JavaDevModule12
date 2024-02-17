package module12;

import module12.db.DbConfig;
import module12.model.Client;
import module12.model.Planet;
import module12.service.ClientCrudService;
import module12.service.PlanetCrudService;
import module12.service.hibernate.HibernateUtil;
import org.flywaydb.core.Flyway;

public class HibernateCrudUsageExample {
    public static void main(String[] args) {
        DbConfig dbConfig = new DbConfig();
        Flyway flyway = Flyway.configure()
                .dataSource(dbConfig.getDbUrl(),dbConfig.getUsername(), dbConfig.getPassword())
                .load();
        flyway.migrate();

        ClientCrudService clientCrudService = new ClientCrudService();
        Client client = new Client();
        client.setName("Donald Trump");
        clientCrudService.saveClient(client);
        Long idClientForDelete = client.getId();
        client = new Client();
        client.setName("Jo Biden");
        clientCrudService.saveClient(client);
        Client foundClient = clientCrudService.findClientById(idClientForDelete);
        clientCrudService.deleteClient(foundClient);

        PlanetCrudService planetCrudService = new PlanetCrudService();
        Planet planet = new Planet();
        planet.setId("SAT");
        planet.setName("Saturn");
        planetCrudService.savePlanet(planet);
        String idPlanetForDelete = planet.getId();
        planet = new Planet();
        planet.setId("URA");
        planet.setName("Uranus");
        planetCrudService.savePlanet(planet);
        Planet foundPlanet = planetCrudService.findPlanetById(idPlanetForDelete);
        planetCrudService.deletePlanet(foundPlanet);

        HibernateUtil.getInstance().close();
    }
}
