public class Main {
    public static void main(String[] args) {
        Sensor tempSensor = new TemperatureSensor();
        Sensor humiditySensor = new HumiditySensor();

        Display display1 = new Display("1");
        Display display2 = new Display("2");
        Logger logger = new Logger();

        tempSensor.addObserver(display1);
        tempSensor.addObserver(display2);
        tempSensor.addObserver(logger);

        humiditySensor.addObserver(display1);
        humiditySensor.addObserver(display2);
        humiditySensor.addObserver(logger);

        tempSensor.readSensor();
        humiditySensor.readSensor();
    }
}
