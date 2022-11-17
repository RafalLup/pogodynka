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
        // LocationRepository repository = new LocationRepository();
        // repository.createNewLocation("21sad","ds","f","city_nddame");
        //  repository.showAllLocalization();

        JsonReading jsonReading = new JsonReading();
        jsonReading.cairnsAccuWeather();
        jsonReading.londonAccuWeather();
        jsonReading.zoccaAccuWeather();
        jsonReading.cairnsOpenWeather();
        jsonReading.londonOpenWeather();
        jsonReading.zoccaOpenWeather();

    }
}
