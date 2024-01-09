package epsi.software.sakila.services;

import epsi.software.sakila.entities.City;

import java.util.List;

/**
 * Interface - CRUD - City
 */
public interface CityService {

    City create(City city);
    City read(Long id);
    List<City> readAll();

    City update(City City);
    boolean delete(Long id);

}
