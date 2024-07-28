import observer.WeatherData;
import observer.WeatherStation;
import observer.WeatherDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay display1 = new WeatherDisplay("Display 1");
        WeatherDisplay display2 = new WeatherDisplay("Display 2");

        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        weatherStation.setWeatherData(new WeatherData(25.0, 65.0, 1013.0));
        weatherStation.setWeatherData(new WeatherData(22.0, 70.0, 1010.0));
    }
}
