public class FuelLevelSensor extends Sensor {
    @Override
    public void readSensor() {
        // Simulación de lectura de sensor
        setSensorData("Nivel de combustible: 50%");
    }
}