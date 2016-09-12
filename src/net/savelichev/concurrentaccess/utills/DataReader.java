package net.savelichev.concurrentaccess.utills;


import net.savelichev.concurrentaccess.interfaces.IMapContainer;

public class DataReader implements Runnable {

    /**
     * Map container.
     */
    private IMapContainer mapContainer;

    public DataReader(IMapContainer mapContainer) {
        this.mapContainer = mapContainer;
    }

    //Read data from map in container
    private void readData() {
        while (true) {
            mapContainer.readData();
        }
    }


    @Override
    public void run() {

        readData();
    }
}
