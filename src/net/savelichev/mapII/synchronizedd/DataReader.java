package net.savelichev.mapII.synchronizedd;


public class DataReader implements Runnable {

    private MapContainer mapContainer;

    public DataReader(MapContainer mapContainer) {
        this.mapContainer = mapContainer;
    }


    public void readData() {
        while (true) {
            mapContainer.readData();
        }
    }

    @Override
    public void run() {

        readData();
    }
}
