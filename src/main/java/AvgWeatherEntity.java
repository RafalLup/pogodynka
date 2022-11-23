import javax.persistence.*;

@Entity
@Table(name = "avg_weather")
public class AvgWeatherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_avg_weather")
    private int id;
    @Column(name = "avg_temperature")
    private double temperature;
    @Column(name = "avg_pressure")
    private double pressure;
    @Column(name = "avg_humidity")
    private double humidity;
    @OneToOne
    private LocationEntity location;
    @Column(name = "avg_wind_speed")
    private double windSpeed;

    public AvgWeatherEntity(int id, double temperature, double pressure, double humidity, double windSpeed) {
        this.id = id;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public AvgWeatherEntity(){

    }

    public AvgWeatherEntity(double temperature, double pressure, double humidity, double windSpeed, LocationEntity location) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.location = location;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return "AvgWeatherEntity{" +
                "id=" + id +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                '}';
    }
}
