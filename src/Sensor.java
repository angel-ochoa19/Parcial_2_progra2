import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {
    private List<Observer> observers = new ArrayList<>();
    private String sensorData;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setSensorData(String sensorData) {
        this.sensorData = sensorData;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(sensorData);
        }
    }

    public abstract void readSensor();
}



