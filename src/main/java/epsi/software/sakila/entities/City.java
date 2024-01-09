package epsi.software.sakila.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="city")
public class City {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="city_id")
    private Long id;
    private String city ;
    @Column(name="last_update")
    private LocalDateTime lastUpdate ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
