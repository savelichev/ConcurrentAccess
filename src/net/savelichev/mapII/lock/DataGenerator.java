package net.savelichev.mapII.lock;


public class DataGenerator implements Runnable {

    private MapContainer mapContainer;

    public DataGenerator(MapContainer mapContainer) {
        this.mapContainer = mapContainer;
    }


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
