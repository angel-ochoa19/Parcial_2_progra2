public class Display implements Observer {
    private String displayId;

    public Display(String displayId) {
        this.displayId = displayId;
    }

    @Override
    public void update(String sensorData) {
        System.out.println("Display " + displayId + " mostrando nuevos datos del sensor: " + sensorData);
    }
}

