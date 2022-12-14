package persistance;

import persistance.repository.AvgWeatherRepository;
import persistance.repository.LocationRepository;

import java.util.Scanner;

public class GUI {


    public static void menu() {
        int userSelect = 11111;
        Scanner in = new Scanner(System.in);
        while (userSelect != 0) {
            System.out.println("     ****************************************");
            System.out.println("     *                 MENU                 *");
            System.out.println("     ****************************************");
            System.out.println("1. DODAJ LOKALIZACJE");
            System.out.println("2. WYSWIETL WSZYSTKIE LOKALIZACJE");
            System.out.println("3. POBIERZ WARTOSCI POGODOWE PO ID LOKALIZACJI");
            System.out.println("4. Pobierz WARTOSCI POGODOWE PO NAZWIE MIASTA");
            System.out.println("0. WYJSCIE Z APLIKACJI");
            userSelect = in.nextInt();

            if (userSelect == 1) {
                LocationRepository repository = new LocationRepository();
                Scanner value = new Scanner(System.in);
                System.out.println("podaj koordynaty");
                String coordinates = value.nextLine();
                System.out.println("podaj nazwe regionu");
                String region = value.nextLine();
                System.out.println("podaj nazwe kraju");
                String countryName = value.nextLine();
                System.out.println("podaj nazwe miasta");
                String cityName = value.nextLine();
                repository.createNewLocation(coordinates, region, countryName, cityName);
            } else if (userSelect == 2) {

                LocationRepository repository1 = new LocationRepository();
                repository1.showAllLocalization();
            } else if (userSelect == 3) {
                AvgWeatherRepository avgWeatherRepository = new AvgWeatherRepository();
                System.out.println("podaj id lokalizacji dla ktorej chcesz otrzymac warunki pogodowe");
                int idLocation = in.nextInt();
                LocationRepository repository = new LocationRepository();
                avgWeatherRepository.createAvgWeatherRepositoryByIdLocation(repository.getById(idLocation));
//            } else if (userSelect == 4) {
//                AvgWeatherRepository avgWeatherRepository = new AvgWeatherRepository();
//                System.out.println("podaj nazwe lokalizacji dla ktorej chcesz otrzymac warunki pogodowe");
//                String cityName = in.nextLine();
//                LocationRepository repository = new LocationRepository();
//                avgWeatherRepository.createAvgWeatherRepositoryByCityName(repository.getByCityName(cityName));
//            }
            }
        }
    }
}



