import javax.persistence.*;
import java.util.List;

public class AvgWeatherRepository {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("pl.sda");
    private static EntityManager entityManager = factory.createEntityManager();
  //String SQL_QUERY ="SELECT avg(a.temperature) AS avg_temperature,avg(a.pressure) AS avg_pressure, avg(a.humidity) AS avg_humidity,avg(a.windSpeed) AS avg_wind_speed FROM WeatherEntity a WHERE a.location.id =80";
String SQL_QUERY = "FROM WeatherEntity a WHERE a.location.id =: idLocation";

//public void getAvgWeatherByIdLocation(int idLocation){
//
//    List <WeatherEntity> resultList = entityManager.createQuery(SQL_QUERY,WeatherEntity.class).setParameter("idLocation",idLocation).getResultList();
//    double temperature = resultList.stream().mapToDouble(WeatherEntity::getTemperature).average().getAsDouble();
//    double pressure = resultList.stream().mapToDouble(WeatherEntity::getPressure).average().getAsDouble();
//    double humidity = resultList.stream().mapToDouble(WeatherEntity::getHumidity).average().getAsDouble();
//    double windSpeed = resultList.stream().mapToDouble(WeatherEntity::getWindSpeed).average().getAsDouble();
//    System.out.println("temperature =:"+temperature +" presure =:"+ pressure +" humidity =:"+ humidity +" windSpeed =:"+ windSpeed);
//}
public void createAvgWeatherRepository(LocationEntity idLocation) {
        List <WeatherEntity> resultList = entityManager.createQuery(SQL_QUERY,WeatherEntity.class).setParameter("idLocation",idLocation.getId()).getResultList();
        double temperature = resultList.stream().mapToDouble(WeatherEntity::getTemperature).average().getAsDouble();
        double pressure = resultList.stream().mapToDouble(WeatherEntity::getPressure).average().getAsDouble();
        double humidity = resultList.stream().mapToDouble(WeatherEntity::getHumidity).average().getAsDouble();
        double windSpeed = resultList.stream().mapToDouble(WeatherEntity::getWindSpeed).average().getAsDouble();
    System.out.println("***************************");
    System.out.println("temperature =:"+(temperature-273)+"\n"+" presure =:"+ pressure +"\n"+" humidity =:"+ humidity + "\n"+" windSpeed =:"+ windSpeed);
    System.out.println("***************************");
        AvgWeatherEntity avgweatherEntity = new AvgWeatherEntity(temperature,pressure,humidity,windSpeed,idLocation);

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(avgweatherEntity);
        transaction.commit();
}



}

