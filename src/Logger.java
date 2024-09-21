import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Logger implements Observer {
    @Override
    public void update(String sensorData) {
        System.out.println("Registro de nuevos datos del sensor: " + sensorData);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sensor_log.txt", true))) {
            writer.write(sensorData);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

