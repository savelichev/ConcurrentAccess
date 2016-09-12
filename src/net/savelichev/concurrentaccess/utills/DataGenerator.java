package net.savelichev.concurrentaccess.utills;

import net.savelichev.concurrentaccess.interfaces.IMapContainer;

/**
 * Generates data and write it into the IMapContainer.
 */
public class DataGenerator implements Runnable {


    /**
     * Map container.
     */
    private IMapContainer mapContainer;

    public DataGenerator(IMapContainer mapContainer) {
        this.mapContainer = mapContainer;
    }


    //Generate data and put it into IMapContainer.
    private void generateData() {
        int key = 0;
        while (true) {
            key++;
            mapContainer.writeData(key, key);

        }
    }


    @Override
    public void run() {

        generateData();
    }
}
