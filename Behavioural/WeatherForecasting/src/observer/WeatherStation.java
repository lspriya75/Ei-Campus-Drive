package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private WeatherData weatherData;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weatherData);
        }
    }
}
