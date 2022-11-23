package persistance;

import persistance.repository.LocationRepository;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LocationRepository repository = new LocationRepository();
        // repository.createNewLocation("16° 55' 31.7676'' S and 145° 45' 14.8320'' E","Queensland","Australia","Cairns");
        // repository.createNewLocation("51° 30' 35.5140'' N and 0° 7' 5.1312'' W.","England","United Kingdom","London");
        //  repository.createNewLocation("44°21′N 10°50′E","Emilia-Romagna","Italian","Zocca");
        //  repository.showAllLocalization();

//        JsonReading jsonReading = new JsonReading();
//        jsonReading.cairnsAccuWeather();
//        jsonReading.londonAccuWeather();
//        jsonReading.zoccaAccuWeather();
//        jsonReading.cairnsOpenWeather();
//        jsonReading.londonOpenWeather();
//        jsonReading.zoccaOpenWeather();
//       persistance.repository.AvgWeatherRepository avgWeatherRepository = new persistance.repository.AvgWeatherRepository();
//      // avgWeatherRepository.getAvgWeatherByIdLocation(80);
//        avgWeatherRepository.createAvgWeatherRepository(80);
//        avgWeatherRepository.createAvgWeatherRepository(81);
//        avgWeatherRepository.createAvgWeatherRepository(82);
        GUI.menu();


    }
}
