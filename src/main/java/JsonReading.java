import org.json.JSONObject;
import persistance.repository.LocationRepository;
import persistance.repository.WeatherRepository;
import persistance.repository.domain.LocationEntity;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class JsonReading {
    public void cairnsAccuWeather () {
        Path inputPath = Paths.get("./AccuWeatherCairns.json");
        try {
            List<String> lines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);
            String accuWeatherCarins = lines.stream().collect(Collectors.joining(""));

            lines.forEach(System.out::println);

            JSONObject obj = new JSONObject(accuWeatherCarins);

            Double temp = obj.getJSONObject("main").getDouble("temp");
            Double presure = obj.getJSONObject("main").getDouble("pressure");
            Double humidity = obj.getJSONObject("main").getDouble("humidity");
            Double windspeed = obj.getJSONObject("wind").getDouble("speed");
            String serviceName = "AccuWeather";

            System.out.println(temp);
            WeatherRepository weather = new WeatherRepository();
            LocationRepository locationRepository= new LocationRepository();
            LocationEntity byId = locationRepository.getById(80);
            weather.createNewWeather(temp, presure, humidity, windspeed, serviceName, byId);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void londonAccuWeather () {
        Path inputPath = Paths.get("./AccuWeatherLondon.json");
        try {
            List<String> lines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);
            String accuWeatherLondon = lines.stream().collect(Collectors.joining(""));

            lines.forEach(System.out::println);

            JSONObject obj = new JSONObject(accuWeatherLondon);

            Double temp = obj.getJSONObject("main").getDouble("temp");
            Double presure = obj.getJSONObject("main").getDouble("pressure");
            Double humidity = obj.getJSONObject("main").getDouble("humidity");
            Double windspeed = obj.getJSONObject("wind").getDouble("speed");
            String serviceName = "AccuWeather";


            System.out.println(temp);
            WeatherRepository weather = new WeatherRepository();
            LocationRepository locationRepository= new LocationRepository();
            LocationEntity byId = locationRepository.getById(81);
            weather.createNewWeather(temp, presure, humidity, windspeed, serviceName, byId);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void zoccaAccuWeather () {
        Path inputPath = Paths.get("./AccuWeatherZocca.json");
        try {
            List<String> lines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);
            String accuWeatherZocca = lines.stream().collect(Collectors.joining(""));

            lines.forEach(System.out::println);

            JSONObject obj = new JSONObject(accuWeatherZocca);

            Double temp = obj.getJSONObject("main").getDouble("temp");
            Double presure = obj.getJSONObject("main").getDouble("pressure");
            Double humidity = obj.getJSONObject("main").getDouble("humidity");
            Double windspeed = obj.getJSONObject("wind").getDouble("speed");
            String serviceName = "AccuWeather";

            System.out.println(temp);
            WeatherRepository weather = new WeatherRepository();
            LocationRepository locationRepository= new LocationRepository();
            LocationEntity byId = locationRepository.getById(82);
            weather.createNewWeather(temp, presure, humidity, windspeed, serviceName, byId);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void cairnsOpenWeather () {
        Path inputPath = Paths.get("./OpenWeatherCairns.json");
        try {
            List<String> lines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);
            String openWeatherCarins = lines.stream().collect(Collectors.joining(""));

            lines.forEach(System.out::println);

            JSONObject obj = new JSONObject(openWeatherCarins);

            Double temp = obj.getJSONObject("main").getDouble("temp");
            Double presure = obj.getJSONObject("main").getDouble("pressure");
            Double humidity = obj.getJSONObject("main").getDouble("humidity");
            Double windspeed = obj.getJSONObject("wind").getDouble("speed");
            String serviceName = "openWeather";

            System.out.println(temp);
            WeatherRepository weather = new WeatherRepository();
            LocationRepository locationRepository= new LocationRepository();
            LocationEntity byId = locationRepository.getById(80);
            weather.createNewWeather(temp, presure, humidity, windspeed, serviceName, byId);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void londonOpenWeather () {
        Path inputPath = Paths.get("./OpenWeatherLondon.json");
        try {
            List<String> lines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);
            String openWeatherLondon = lines.stream().collect(Collectors.joining(""));

            lines.forEach(System.out::println);

            JSONObject obj = new JSONObject(openWeatherLondon);

            Double temp = obj.getJSONObject("main").getDouble("temp");
            Double presure = obj.getJSONObject("main").getDouble("pressure");
            Double humidity = obj.getJSONObject("main").getDouble("humidity");
            Double windspeed = obj.getJSONObject("wind").getDouble("speed");
            String serviceName = "openWeather";


            System.out.println(temp);
            WeatherRepository weather = new WeatherRepository();
            LocationRepository locationRepository= new LocationRepository();
            LocationEntity byId = locationRepository.getById(81);
            weather.createNewWeather(temp, presure, humidity, windspeed,serviceName, byId);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void zoccaOpenWeather () {
        Path inputPath = Paths.get("./OpenWeatherZocca.json");
        try {
            List<String> lines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);
            String openWeatherZocca = lines.stream().collect(Collectors.joining(""));

            lines.forEach(System.out::println);

            JSONObject obj = new JSONObject(openWeatherZocca);

            Double temp = obj.getJSONObject("main").getDouble("temp");
            Double presure = obj.getJSONObject("main").getDouble("pressure");
            Double humidity = obj.getJSONObject("main").getDouble("humidity");
            Double windspeed = obj.getJSONObject("wind").getDouble("speed");
            String serviceName = "openWeather";

            System.out.println(temp);
            WeatherRepository weather = new WeatherRepository();
            LocationRepository locationRepository= new LocationRepository();
            LocationEntity byId = locationRepository.getById(82);

            weather.createNewWeather(temp, presure, humidity, windspeed, serviceName,byId);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}


