package observer;

public class WeatherDisplay implements Observer {
    private String name;

    public WeatherDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(WeatherData weatherData) {
        System.out.println(name + " received update: " + weatherData);
    }
}
