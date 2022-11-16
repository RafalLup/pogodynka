import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LocationRepository {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("pl.sda");
    private static EntityManager entityManager = factory.createEntityManager();

    public void createNewLocation(String coordinates, String region, String countryName, String cityName) {
        LocationEntity locationEntity = new LocationEntity(coordinates, region, countryName, cityName);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(locationEntity);
        transaction.commit();
    }

    public void showAllLocalization() {

        List<LocationEntity> resultList = entityManager.createQuery("FROM LocationEntity", LocationEntity.class).getResultList();
        System.out.println(resultList);

    }
}