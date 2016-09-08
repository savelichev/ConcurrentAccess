package net.savelichev.mapII.synchronizedMap;


public class DataGenerator implements Runnable {

    private MapContainer mapContainer;

    public DataGenerator(MapContainer mapContainer) {
        this.mapContainer = mapContainer;
    }

    /**
     * Generate data and put it into map
     */
    public void generateData(){
        int key=0;
        while (true){
            key++;
            mapContainer.writeData(key,key);

        }
    }


    @Override
    public void run() {

        generateData();
    }
}