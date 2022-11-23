import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class WeatherRepository {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("pl.sda");
    private static EntityManager entityManager = factory.createEntityManager();


    public void createNewWeather(Double temp, Double pressure, Double humidity, Double windspeed, String serviceName, LocationEntity byId) {
        WeatherEntity weatherEntity = new WeatherEntity(temp,pressure, humidity, windspeed,serviceName,byId);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(weatherEntity);
        transaction.commit();
    }



}
