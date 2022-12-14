package persistance.repository;

import persistance.repository.domain.AvgWeatherEntity;
import persistance.repository.domain.LocationEntity;
import persistance.repository.domain.WeatherEntity;

import javax.persistence.*;
import java.util.List;

public class AvgWeatherRepository {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("pl.sda");
    private static EntityManager entityManager = factory.createEntityManager();
  //String SQL_QUERY ="SELECT avg(a.temperature) AS avg_temperature,avg(a.pressure) AS avg_pressure, avg(a.humidity) AS avg_humidity,avg(a.windSpeed) AS avg_wind_speed FROM persistance.repository.domain.WeatherEntity a WHERE a.location.id =80";
String SQL_QUERY = "FROM persistance.repository.domain.WeatherEntity a WHERE a.location.id =: idLocation";
    String SQL_QUERY1 = "FROM persistance.repository.domain.LocationEntity a WHERE a.city_name =: cityName";

//public void getAvgWeatherByIdLocation(int idLocation){
//
//    List <persistance.repository.domain.WeatherEntity> resultList = entityManager.createQuery(SQL_QUERY,persistance.repository.domain.WeatherEntity.class).setParameter("idLocation",idLocation).getResultList();
//    double temperature = resultList.stream().mapToDouble(persistance.repository.domain.WeatherEntity::getTemperature).average().getAsDouble();
//    double pressure = resultList.stream().mapToDouble(persistance.repository.domain.WeatherEntity::getPressure).average().getAsDouble();
//    double humidity = resultList.stream().mapToDouble(persistance.repository.domain.WeatherEntity::getHumidity).average().getAsDouble();
//    double windSpeed = resultList.stream().mapToDouble(persistance.repository.domain.WeatherEntity::getWindSpeed).average().getAsDouble();
//    System.out.println("temperature =:"+temperature +" presure =:"+ pressure +" humidity =:"+ humidity +" windSpeed =:"+ windSpeed);
//}
public void createAvgWeatherRepositoryByIdLocation(LocationEntity idLocation) {
        List <WeatherEntity> resultList = entityManager.createQuery(SQL_QUERY, WeatherEntity.class).setParameter("idLocation",idLocation.getId()).getResultList();
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
//    public void createAvgWeatherRepositoryByCityName(LocationEntity cityName) {
//        List <WeatherEntity> resultList = entityManager.createQuery(SQL_QUERY1, WeatherEntity.class).setParameter("cityName",cityName.getCityName());
//        double temperature = resultList.stream().mapToDouble(WeatherEntity::getTemperature).average().getAsDouble();
//        double pressure = resultList.stream().mapToDouble(WeatherEntity::getPressure).average().getAsDouble();
//        double humidity = resultList.stream().mapToDouble(WeatherEntity::getHumidity).average().getAsDouble();
//        double windSpeed = resultList.stream().mapToDouble(WeatherEntity::getWindSpeed).average().getAsDouble();
//        System.out.println("***************************");
//        System.out.println("temperature =:"+(temperature-273)+"\n"+" presure =:"+ pressure +"\n"+" humidity =:"+ humidity + "\n"+" windSpeed =:"+ windSpeed);
//        System.out.println("***************************");
//        AvgWeatherEntity avgweatherEntity = new AvgWeatherEntity(temperature,pressure,humidity,windSpeed,cityName);
//
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.persist(avgweatherEntity);
//        transaction.commit();
//    }



}

