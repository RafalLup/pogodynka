import javax.persistence.*;

@Entity
@Table(name = "weather")
public class WeatherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private Double temperature;
    private Double pressure;
    private Double humidity;
    @Column(name = "wind_speed")
    private Double windSpeed;
    @OneToOne
    private LocationEntity location;
    @Column(name = "service_name")
    private String serviceName;
    public WeatherEntity(){

    }

    public WeatherEntity(Double temp, Double pressure, Double humidity, Double windSpeed,String serviceName,LocationEntity locationById) {
        this.location = locationById;
        this.serviceName = serviceName;
        this.temperature = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windSpeed = windSpeed;

    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public LocationEntity getLocation() {
        return location;
    }

    public void setLocation(LocationEntity location) {
        this.location = location;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "WeatherEntity{" +
                "id=" + id +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", location=" + location +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}

