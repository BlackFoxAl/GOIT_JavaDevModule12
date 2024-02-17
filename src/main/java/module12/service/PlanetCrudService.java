package module12.service;


import module12.dao.PlanetDao;
import module12.model.Planet;

public class PlanetCrudService {
    private PlanetDao planetDao = new PlanetDao();

    public void savePlanet(Planet planet) {
        planetDao.save(planet);
    }

    public Planet findPlanetById(String id) {
        return planetDao.findById(id);
    }

    public void updatePlanet(Planet planet) {
        planetDao.update(planet);
    }

    public void deletePlanet(Planet planet) {
        planetDao.delete(planet);
    }
}
