package epsi.software.sakila.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CityServiceTest {

    @Autowired
    CityService service;


    @Test
    void read() {
    }

    @Test
    void readAll() {
        service.readAll().stream().forEach(c-> System.out.println(c));
    }
}