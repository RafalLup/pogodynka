import javax.persistence.*;

@Entity
@Table (name = "location")
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private int id;
    private String coordinates;
    @Column(name = "country_name")
    private String countryName;

    private String region;
    @Column(name = "city_name")
    private String cityName;
    public LocationEntity(){

    }

    public LocationEntity(String coordinates,String region, String countryName, String cityName) {
        this.coordinates = coordinates;
        this.region = region;
        this.countryName = countryName;
        this.cityName = cityName;
    }


    public String getCoordinates() {
        return coordinates;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getRegion() {
        return region;
    }

    public String getCityName() {
        return cityName;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "LocationEntity{" +
                "id=" + id +
                ", coordinates='" + coordinates + '\'' +
                ", countryName='" + countryName + '\'' +
                ", region='" + region + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
