public class TemperatureSensor extends Sensor {
    @Override
    public void readSensor() {
        // Simulación de lectura de sensor
        setSensorData("Temperatura: 75°C");
    }
}
