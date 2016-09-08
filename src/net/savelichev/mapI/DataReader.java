package net.savelichev.mapI;


public class DataReader implements Runnable {

    private MapContainer mapContainer;

    public DataReader(MapContainer mapContainer) {
        this.mapContainer = mapContainer;
    }


    /**
     * read Data from map in container
     */
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
