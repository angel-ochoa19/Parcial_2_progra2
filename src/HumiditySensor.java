public class HumiditySensor extends Sensor {
    @Override
    public void readSensor() {
        // Simulación de lectura de sensor
        setSensorData("Humedad: 10%");
    }
}
