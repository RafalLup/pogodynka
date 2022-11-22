import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

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
       AvgWeatherRepository avgWeatherRepository = new AvgWeatherRepository();
       avgWeatherRepository.getAvgWeather(80);


    }
}
